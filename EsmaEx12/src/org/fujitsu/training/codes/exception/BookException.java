package org.fujitsu.training.codes.exception;

public class BookException extends Exception{

	private static final long serialVersionUID = 1L;

	private String message = "Only 5 instances of book";
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println(message);
	}
}
