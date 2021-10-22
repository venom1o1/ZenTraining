package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.employee;
public interface EmpRepository extends JpaRepository<employee, Integer> 
{
	
	
}
