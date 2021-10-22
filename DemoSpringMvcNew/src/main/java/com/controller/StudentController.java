package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class StudentController {
	@RequestMapping(value = "/home")
	public String Neeraj()
	{
		System.out.println("Home controller passing through");
		return "Welcome user ";
		
	}

}
