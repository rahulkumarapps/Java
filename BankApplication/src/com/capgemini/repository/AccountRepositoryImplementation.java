package com.capgemini.repository;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.model.Account;

public class AccountRepositoryImplementation implements AccountRepository{

	List<Account> accountsList =new ArrayList<>();
	@Override
	public boolean saveAccoount(Account account) {
		if(account==null)
			return false;
		accountsList.add(account);
		return true;
	}

	@Override
	public Account searchAccount(long accountNumber) {
		for (Account account : accountsList) {
			
			if(account.getAccountNumber()==accountNumber){
				return account;
			}
			
		} 
		return null;
	}

	@Override
	public boolean updateAccount(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

}
