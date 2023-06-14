package com.student.StudentCrudOperations.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address extends PrimaryKey {

	private String city;
	private String state;
	private String country;
	private String zipCode;
	@OneToOne(cascade = CascadeType.ALL)
	private StudentInfo student_add;
}
