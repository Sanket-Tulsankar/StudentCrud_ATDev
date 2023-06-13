package com.student.StudentCrudOperations.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<?> validationException(ValidationException ex){
		String exception_msg=ex.error_msg;
		return new ResponseEntity<>(exception_msg,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<?> notFoundException(NotFoundException ex){
		String msg=ex.msg;
		return new ResponseEntity<>(msg,HttpStatus.NOT_FOUND);
	}
}
