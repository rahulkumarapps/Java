package com.capgemini.exceptions;

public class DuplicateAccountException extends Exception {
	
	private String message;

	public DuplicateAccountException(String message) {
		super();
		this.message = message;
	}

}
