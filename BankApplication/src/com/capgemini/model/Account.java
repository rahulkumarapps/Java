package com.capgemini.model;

public class Account {
	private long accountNumber;
	private double amount;
	private Customer customer;
	
	
	public Account(long accountNumber, double amount, Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.customer = customer;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
