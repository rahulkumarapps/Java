package com.capgemini.service;

import com.capgemini.exceptions.DuplicateAccountException;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InsufficientInitialBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.model.Account;
import com.capgemini.model.Customer;
import com.capgemini.repository.AccountRepository;
import com.capgemini.repository.AccountRepositoryImplementation;

public class AccountRepositoryServiceImplementation {
	
	AccountRepository acctRepository = new AccountRepositoryImplementation();
	
	public Account createAccount(long accountNo, double amount, String firstName,String lastName)throws InsufficientInitialBalanceException,DuplicateAccountException{
		
		if(amount<500){
			throw new InsufficientInitialBalanceException("Insufficient initial balance");
		}
		Account account =new Account(accountNo, amount, new Customer(firstName, lastName));
		
		return account;
		
	}
	public Account depositAmount(long accountNo, double amount)throws InvalidAccountNumberException{
		Account account =acctRepository.searchAccount(accountNo);
		if(amount>0){
			account.setAmount(account.getAmount()+amount);
		}
		return account;
		
	}
	public Account withdrawAmount(long accountNo, double amount)throws InsufficientBalanceException{
		
		Account account =acctRepository.searchAccount(accountNo);
		if(amount>0 && amount <account.getAmount()){
			account.setAmount(account.getAmount()-amount);
		}
		return account;
	
	}

}
