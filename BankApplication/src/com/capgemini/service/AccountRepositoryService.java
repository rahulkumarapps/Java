package com.capgemini.service;

import com.capgemini.exceptions.InsufficientInitialBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.DuplicateAccountException;
import com.capgemini.model.Account;

public interface AccountRepositoryService {

	
	public Account createAccount(long accountNo, double amount, String firstName,String lastName)throws InsufficientInitialBalanceException,DuplicateAccountException;
	public Account depositAmount(long accountNo, double amount)throws InvalidAccountNumberException;
	public Account withdrawAmount(long accountNo, double amount)throws InsufficientBalanceException;
	
}
