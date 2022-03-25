package com.mysite.hello;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
	
	private final StudentRepository repository;
	
	StudentController(StudentRepository repository){
		this.repository = repository;
	}
	
	@GetMapping("/students")
	List<Student> getAll(){
		return repository.findAll();
	}
	
	@PostMapping("/students")
	Student newStudent(@RequestBody Student st) {
		return repository.save(st);
	}
	
	@DeleteMapping("/students/{id}")
	void deleteStudent(@PathVariable Long id) {
		repository.deleteById(id);
		
	}
	
	@PutMapping("/students/{id}")
	Student updateStudent(@RequestBody Student st,@PathVariable Long id){
		return repository.findById(id).map(
				student -> {
					student.setName(st.getName());
					return repository.save(student);
				}).orElseGet(() -> {
					st.setId(id);
					return repository.save(st);
				});
	}

}
