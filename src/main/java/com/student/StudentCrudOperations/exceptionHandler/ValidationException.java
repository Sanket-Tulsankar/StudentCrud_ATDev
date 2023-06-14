package com.student.StudentCrudOperations.exceptionHandler;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
public class ValidationException extends Exception{

	private String msg;

	public ValidationException(String msg) {
		super();
		this.msg = msg;
	}
	
	
}
