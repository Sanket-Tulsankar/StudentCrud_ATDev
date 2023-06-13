package com.student.StudentCrudOperations.exceptionHandler;

public class NotFoundException extends Exception{

	public String msg;

	public NotFoundException(String msg) {
		super();
		this.msg = msg;
	}
	
	
}
