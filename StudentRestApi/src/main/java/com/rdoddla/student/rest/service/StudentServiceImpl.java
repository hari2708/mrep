package com.rdoddla.student.rest.service;

import java.util.List;

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

	@Override
	public Student getStudentById(int id) {
		return studentRepo.findById((long) id).get();
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public void delStudent(int id) {
		 studentRepo.deleteById((long) id);
	}
	
	
}
