package com.tcs.springMVC.service;

import java.util.List;

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
	
	public Student getStudentByEmail(Student student)
	{
		Student receivedStudent=studentDao.getStudentByEmail(student.getEmail());
		if(student.getPassword().equals(receivedStudent.getPassword())) {
			return receivedStudent;
		}
		return null;
				
	}
	
	public List<Student> getAllStudents()
	{
		return studentDao.getAllStudents();
	}
	
	public void deleteStudent(int id)
	{
		 studentDao.deleteStudentById(id);
	}
	
	public Student getStudentById(int id)
	{
		Student fetchedStudent= studentDao.getStudentById(id);
		
		return fetchedStudent;
	}
	
	public Student updateStudent(Student student)
	{
		return studentDao.updateStudent(student);
	}
	
}
