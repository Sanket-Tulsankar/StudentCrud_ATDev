package com.student.StudentCrudOperations.services;

import java.util.List;

import com.student.StudentCrudOperations.entity.StudentInfo;
import com.student.StudentCrudOperations.exceptionHandler.NotFoundException;
import com.student.StudentCrudOperations.exceptionHandler.ValidationException;

public interface StudentService {
	
	StudentInfo addStudent(StudentInfo studentInfo) throws ValidationException;
	
	StudentInfo getStudentInfo(long id) throws NotFoundException;
	
	List<StudentInfo> getAllStudents() throws NotFoundException;
	
	String deleteStudent(long id) throws NotFoundException;
	
	StudentInfo updateStudent(long id,StudentInfo studentInfo)throws NotFoundException;
}
