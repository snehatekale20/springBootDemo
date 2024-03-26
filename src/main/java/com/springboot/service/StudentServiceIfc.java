package com.springboot.service;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

import com.springboot.model.Student;

@Configuration
public interface StudentServiceIfc {
	
	public Student saveStudent(Student st);
	
	public List<Student> getStudent();

	public Student basedOnRollno(int rollNo);

	public Student deleteStudent(int rollNo);

	//public Student updateStudent(Student st);

}
