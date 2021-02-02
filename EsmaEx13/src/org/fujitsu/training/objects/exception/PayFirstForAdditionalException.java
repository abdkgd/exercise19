package org.fujitsu.training.objects.exception;

public class PayFirstForAdditionalException extends Exception{

	private static final long serialVersionUID = 1L;
	private String message = "Pay for Additional";
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println(message);
	}
}
