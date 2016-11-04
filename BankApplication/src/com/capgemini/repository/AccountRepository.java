package com.capgemini.repository;

import com.capgemini.model.Account;

public interface AccountRepository {

	public boolean saveAccoount(Account account) ;
	public Account searchAccount(long accountNumber);
	public boolean updateAccount(Account account);
	
	
}
