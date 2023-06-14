package com.student.StudentCrudOperations.exceptionHandler;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
public class NotFoundException extends Exception {

	private String err_msg;

	public NotFoundException(String err_msg) {
		super();
		this.err_msg = err_msg;
	}
	
	
}
