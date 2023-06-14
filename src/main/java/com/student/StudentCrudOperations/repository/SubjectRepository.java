package com.student.StudentCrudOperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.StudentCrudOperations.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
