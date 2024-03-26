package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Student;
import com.springboot.service.StudentServiceIfc;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentServiceIfc studentService;

	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student st) {
		return studentService.saveStudent(st);
	}
	
	@GetMapping("/list")
	public List<Student> getStudent(){
		return studentService.getStudent();
		
	}
	
	@GetMapping("/list/{rollNo}")
	public Student basedOnRollno(@PathVariable int rollNo) {
		return studentService.basedOnRollno(rollNo);
	}
	
	
	
	
	@DeleteMapping("/delete")
	public Student deleteStudent(@RequestParam int rollNo) {
		return studentService.deleteStudent(rollNo);
		
	}
}
