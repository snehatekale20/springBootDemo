package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Student;

@Service
public class StudentServiceImpl implements StudentServiceIfc{

	private static List<Student> list = new ArrayList<>();
	
	

	
	@Override
	public Student saveStudent(Student st) {
		list.add(st);
		return st;
	}

	@Override
	public List<Student> getStudent() {
		return list;
	}

	@Override
	public Student basedOnRollno(int rollNo) {
		return list.stream().filter(st->st.rollNo()==rollNo).findAny().get();
	}

	@Override
	public Student deleteStudent(int rollNo) {
		Student st =list.stream().filter(st1->st1.rollNo()==rollNo).findAny().get();
		
		 list.remove(st);
		 return st;
		
	}

	

}
