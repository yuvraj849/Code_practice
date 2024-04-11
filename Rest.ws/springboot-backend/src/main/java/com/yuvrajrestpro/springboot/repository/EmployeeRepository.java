package com.yuvrajrestpro.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuvrajrestpro.springboot.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	//List<Employee> findAll();
	//ALL CRUD DATBASE METHOD

}
