package com.capgemini.exceptions;

public class InsufficientBalanceException extends Exception {
	private String message;

	public InsufficientBalanceException(String message) {
		super();
		this.message = message;
	}

}
