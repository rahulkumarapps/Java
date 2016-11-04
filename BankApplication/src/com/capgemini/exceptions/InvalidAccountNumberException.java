package com.capgemini.exceptions;

public class InvalidAccountNumberException extends Exception{
	private String message;

	public InvalidAccountNumberException(String message) {
		super();
		this.message = message;
	}

}
