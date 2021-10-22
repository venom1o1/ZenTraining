package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EmpRepository;
import com.example.model.employee;

@RestController
public class EmployeeController 
{
	@Autowired
	private EmpRepository erepo;
	
	
	@PostMapping(value="/add")
	public boolean addEmp(@RequestBody employee e1)
	{
		erepo.save(e1);
		
		return true;
	}
}
