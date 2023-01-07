package com.tcs.springMVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.springMVC.dao.StudentDao;
import com.tcs.springMVC.dto.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	
	
	public void saveStudent(Student student)
	{
		studentDao.saveStudent(student);
	}
}
