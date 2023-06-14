package com.student.StudentCrudOperations.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Student_Info")
public class StudentInfo extends PrimaryKey{
	
	@Column(name = "first_name")
	@NonNull
	private String firstName;
	
	@Column(name = "last_name")
	@NonNull
	private String lastName;
	
	@Column(name = "student_age")
	private int age;
	
	@OneToMany(mappedBy = "studentInfo")
	private List<Subject> subjects;
	
	@OneToOne(mappedBy = "student_add",cascade = CascadeType.ALL)
	private Address address;
}
