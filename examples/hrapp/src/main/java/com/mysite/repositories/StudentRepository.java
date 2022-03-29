package com.mysite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysite.model.Employee;
import com.mysite.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
