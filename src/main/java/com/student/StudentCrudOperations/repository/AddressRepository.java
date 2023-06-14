package com.student.StudentCrudOperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.StudentCrudOperations.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
