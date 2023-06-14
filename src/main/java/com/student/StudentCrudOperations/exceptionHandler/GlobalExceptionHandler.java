package com.student.StudentCrudOperations.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<?> notFoundException(NotFoundException ex){
		System.out.println("IN NOT_FOUND_EXCEPTION");
		String err=ex.getErr_msg();
		return new ResponseEntity<String>(err,HttpStatus.NOT_FOUND);
	}
	
	public ResponseEntity<?> validationException(ValidationException ex){
		System.out.println("IN VALIDATION_EXCEPTION");
		String err=ex.getMsg();
		return new ResponseEntity<String>(err,HttpStatus.BAD_REQUEST);
	}
}
