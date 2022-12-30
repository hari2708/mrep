package com.rdoddla.student.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdoddla.student.rest.model.Student;
import com.rdoddla.student.rest.service.StudentService;

@RestController
@RequestMapping("/")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PutMapping("student")
	public Student saveStudent(Student student) {
		
		return null;
	}
}
