package com.tcs.springMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.springMVC.dto.Student;
import com.tcs.springMVC.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService service;
	
	@RequestMapping("login")
	public ModelAndView loginStudent()
	{
		ModelAndView modelAndView=new ModelAndView();
		
		modelAndView.setViewName("login.jsp");
		modelAndView.addObject("loginStudent",new Student());
		
		return modelAndView;
	}
	
	@RequestMapping("signup")
	public ModelAndView signupStudent()
	{
		ModelAndView modelAndView=new ModelAndView();
		
		modelAndView.setViewName("signup.jsp");
		modelAndView.addObject("signupStudent",new Student());
		
		return modelAndView;
	}
}
