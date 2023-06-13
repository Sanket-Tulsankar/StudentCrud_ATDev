package com.student.StudentCrudOperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.StudentCrudOperations.entity.StudentInfo;

@Repository
public interface StudentRepository extends JpaRepository<StudentInfo, Long>{

}
