package com.capgemini.exceptions;

public class InsufficientInitialBalanceException extends Exception {
	private String message;

	public InsufficientInitialBalanceException(String message) {
		super();
		this.message = message;
	}

}
