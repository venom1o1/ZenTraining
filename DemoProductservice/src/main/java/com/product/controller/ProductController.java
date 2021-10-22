package com.product.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.converters.Auto;
import com.product.service.Productservice;

@RestController
public class ProductController {

	@Autowired
	private Productservice pserv;
	
	@GetMapping
	
}
