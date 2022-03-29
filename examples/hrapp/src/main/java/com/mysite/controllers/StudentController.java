package com.mysite.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysite.model.Employee;
import com.mysite.model.Student;
import com.mysite.repositories.EmployeeRepository;
import com.mysite.repositories.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private final StudentRepository repository;
	
	StudentController(StudentRepository repository){
		this.repository = repository;
	}
	
	@GetMapping("/students")
	List<Student> getAll(){
		System.out.print("#################");
		return repository.findAll();
	}

}
