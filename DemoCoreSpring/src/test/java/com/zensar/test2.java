package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test2 {
	public static void main(String args[])
	{
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	System.out.println("Container started");
	
	}
}
