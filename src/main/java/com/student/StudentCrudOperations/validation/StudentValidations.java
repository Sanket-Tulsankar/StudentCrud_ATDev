package com.student.StudentCrudOperations.validation;

import com.student.StudentCrudOperations.entity.StudentInfo;
import com.student.StudentCrudOperations.exceptionHandler.ValidationException;

public class StudentValidations {

	public static void validateStudent(StudentInfo studentInfo) throws ValidationException {
		validateName(studentInfo.getFirstName(), studentInfo.getLastName());
		validateAge(studentInfo.getAge());
		// validateMarks(subjects.getMarks());
	}

	/*
	 * private static void validateMarks(int marks) throws ValidationException {
	 * if(marks<35) throw new ValidationException("Failed in the subject !!!!"); }
	 */

	public static void validateAge(int age) throws ValidationException {
		if (age < 16)
			throw new ValidationException("Age is less than the expected !!!!");
	}

	private static void validateName(String firstName, String lastName) throws ValidationException {
		if (firstName.length() < 3 || lastName.length() < 3)
			throw new ValidationException("Name must be greater than 3 characters each!!!!");
	}
}
