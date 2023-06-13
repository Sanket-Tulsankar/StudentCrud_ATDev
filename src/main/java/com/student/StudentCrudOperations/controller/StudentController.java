package com.student.StudentCrudOperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.StudentCrudOperations.entity.StudentInfo;
import com.student.StudentCrudOperations.exceptionHandler.NotFoundException;
import com.student.StudentCrudOperations.exceptionHandler.ValidationException;
import com.student.StudentCrudOperations.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	// Add a method to add student POST
	@PostMapping("/add")
	public ResponseEntity<StudentInfo> addStudent(@RequestBody StudentInfo studentinfo) throws ValidationException {
		System.out.println("In student add methos POST mapping !!!!!");
		return new ResponseEntity<StudentInfo>(studentService.addStudent(studentinfo), HttpStatus.CREATED);
	}

	// Add a method to get single student GET
	@GetMapping("/get/{id}")
	public ResponseEntity<StudentInfo> getStudent(@PathVariable("id") long id) throws NotFoundException {
		System.out.println("In student get method for getting single student !!!!");
		return new ResponseEntity<StudentInfo>(studentService.getStudentInfo(id), HttpStatus.OK);
	}

	// Add a method to get all the student list GET all
	@GetMapping("/getAll")
	public ResponseEntity<List<StudentInfo>> getAllStudents() throws NotFoundException {
		System.out.println("In student get method to get all students !!!!");
		return new ResponseEntity<List<StudentInfo>>(studentService.getAllStudents(), HttpStatus.OK);
	}

	// Add a method to delete the student by id
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable("id") long id)
			throws NotFoundException {
		System.out.println("In student delete method, delete with id");
		return new ResponseEntity<String>(studentService.deleteStudent(id), HttpStatus.OK);
	}

	// Add a method to update student information
	@PutMapping("update/{id}")
	public ResponseEntity<?> updateStudent(@PathVariable("id") long id, @RequestBody StudentInfo studentinfo)
			throws NotFoundException {
		System.out.println("In student update method for updating student information by id !!!!");
		return new ResponseEntity<>(studentService.updateStudent(id, studentinfo), HttpStatus.OK);
	}
}
