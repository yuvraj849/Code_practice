package com.yuvrajrestpro.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yuvrajrestpro.springboot.exception.ResourceNotFoundException;
import com.yuvrajrestpro.springboot.model.Employee;
import com.yuvrajrestpro.springboot.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository er;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		
		return er.findAll();
	}
	//build create employee Rest Api
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return er.save(employee);
	}
	
	//build get employee by id rest api
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
		
		Employee employee = er.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("employye not exit with id:"+id));
		return ResponseEntity.ok(employee);
	}
	
	//build update empolyee rest api
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable long id ,@RequestBody Employee employeeDetails){
		Employee update = er.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("employee not exit with id" +id));
		
		update.setFirstname(employeeDetails.getFirstname());
		update.setLastname(employeeDetails.getLastname());
		update.setEmailId(employeeDetails.getEmailId());
		
		er.save(update);
		return ResponseEntity.ok(update);
		
	}
	
	//build delete employee rest api
	@DeleteMapping("{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){
		Employee employee = er.findById(id).orElseThrow(() -> new ResourceNotFoundException("employee not exit with id"+ id));
		er.delete(employee);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
