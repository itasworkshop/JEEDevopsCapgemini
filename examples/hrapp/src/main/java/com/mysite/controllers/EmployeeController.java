package com.mysite.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysite.model.Employee;
import com.mysite.repositories.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private final EmployeeRepository repository;
	
	EmployeeController(EmployeeRepository repository){
		this.repository = repository;
	}
	
	@GetMapping("/employees")
	List<Employee> getAll(){
		System.out.print("#################");
		return repository.findAll();
	}

}
