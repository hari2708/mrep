package com.rdoddla.student.rest.service;

import java.util.List;

import com.rdoddla.student.rest.model.Student;

public interface StudentService {
	
	Student saveStudent(Student student);
	Student getStudentById(int id);
	List<Student> getAllStudents();
	void delStudent(int id);

}
