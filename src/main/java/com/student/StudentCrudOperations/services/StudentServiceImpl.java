package com.student.StudentCrudOperations.services;

import static com.student.StudentCrudOperations.validation.StudentValidations.validateStudent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.StudentCrudOperations.entity.StudentInfo;
import com.student.StudentCrudOperations.exceptionHandler.NotFoundException;
import com.student.StudentCrudOperations.exceptionHandler.ValidationException;
import com.student.StudentCrudOperations.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public StudentInfo addStudent(StudentInfo studentInfo) throws ValidationException {
		validateStudent(studentInfo);
		studentRepository.save(studentInfo);
		return studentInfo;
	}

	@Override
	public StudentInfo getStudentInfo(long id) throws NotFoundException {
		StudentInfo s = studentWithIdFound(id);
		return s;
	}

	@Override
	public List<StudentInfo> getAllStudents() throws NotFoundException {
		List<StudentInfo> list = studentRepository.findAll();
		if (list.isEmpty())
			throw new NotFoundException("Student list is empty !!!!");
		return list;
	}

	@Override
	public String deleteStudent(long id) throws NotFoundException {
		StudentInfo studentInfo = studentWithIdFound(id);
		studentRepository.delete(studentInfo);
		return "Student with id : " + id + " is deleted successfully";
	}

	@Override
	public StudentInfo updateStudent(long id, StudentInfo studentInfo) throws NotFoundException {
		studentWithIdFound(id);
		StudentInfo s=new StudentInfo();
		s.setId(id);
		s.setFirstName(studentInfo.getFirstName());
		s.setLastName(studentInfo.getLastName());
		s.setAge(studentInfo.getAge());
		studentRepository.save(s);
		return s;
	}

	private StudentInfo studentWithIdFound(long id) throws NotFoundException {
		return studentRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("Student with id : " + id + " not found"));
	}
}
