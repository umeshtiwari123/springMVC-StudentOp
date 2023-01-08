package com.tcs.springMVC.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcs.springMVC.dto.Student;

@Repository
public class StudentDao {

	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	public Student saveStudent(Student student)
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}
	
	public Student updateStudent(Student student)
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		return student;
	}
	
	public Student deleteStudentById(int id)
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student deleteStudent=entityManager.find(Student.class, id);
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(deleteStudent);
		entityTransaction.commit();
		return deleteStudent;
	}
	
	
	public Student getStudentById(int id)
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student receivedStudent=entityManager.find(Student.class, id);
		
		return receivedStudent;
	}
	
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudents()
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("Select s from Student s",Student.class);
		
		
		return query.getResultList();
	}
	
	public Student getStudentByEmail(String email)
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("Select s from Student s where s.email=?1",Student.class);
		return (Student) query.getSingleResult();
	}
}
