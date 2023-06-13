package com.student.StudentCrudOperations.exceptionHandler;

public class ValidationException extends Exception{

	String error_msg;

	public ValidationException(String error_msg) {
		super();
		this.error_msg = error_msg;
	}
	
	
}
