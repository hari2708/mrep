package com.rdoddla.student.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rdoddla.student.rest.model.Student;
import com.rdoddla.student.rest.service.StudentService;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("student")
	public Student saveStudent(@RequestBody Student student) {
		
		return studentService.saveStudent(student);
	}
	
	@GetMapping("student/{id1}")
	public Student getstudentById(@PathVariable("id1") int id) {
		System.out.println("@PathVariable = "+id);
		return studentService.getStudentById(id);
	}
	
	@GetMapping("students")
	public List<Student> getStudents(){
		return studentService.getAllStudents();
	}
	
	@DeleteMapping("student/del/{id}")
	public void delStudent() {
		
	}
}
