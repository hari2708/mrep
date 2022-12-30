package com.rdoddla.student.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdoddla.student.rest.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
