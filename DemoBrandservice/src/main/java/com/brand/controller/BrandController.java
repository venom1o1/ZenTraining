package com.brand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.brand.model.Brand;
import com.brand.service.BrandService;

@RestController
public class BrandController 
{
	@Autowired
	private BrandService brandservice;
	
	@GetMapping(value="/{brandname}")
	public Brand getBrand(@PathVariable String brandname) 
	{
		
		return brandservice.getBrand(brandname) ;
	}
}
