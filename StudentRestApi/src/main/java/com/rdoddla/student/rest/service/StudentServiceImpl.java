package com.rdoddla.student.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdoddla.student.rest.model.Student;
import com.rdoddla.student.rest.repository.StudentRepo;

@Service
public class StudentServiceImpl  implements StudentService{

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}
	
	
}
