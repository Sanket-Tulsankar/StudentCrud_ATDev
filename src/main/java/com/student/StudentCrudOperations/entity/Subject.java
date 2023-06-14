package com.student.StudentCrudOperations.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subject extends PrimaryKey{

	private String subjectName;
	
	private int marks;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private StudentInfo studentInfo;
}
