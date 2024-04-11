package com.yuvrajrestpro.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yuvrajrestpro.springboot.model.Employee;
import com.yuvrajrestpro.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
	private EmployeeRepository er;
	@Override
	public void run(String... args) throws Exception {
		/*
		Employee employee= new Employee();
		employee.setFirstname("yuvraj");
		employee.setLastname("solanki");
		employee.setEmailId("ysolanki849@gmail.com");
		er.save(employee);*/
		
	}

}