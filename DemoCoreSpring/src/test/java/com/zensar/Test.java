package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[])
	{
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("springconfig.xml");
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		System.out.println("Container started");
		Student s1= (Student) ctx.getBean("sobj");
		Student s2= (Student) ctx.getBean("sobj2");
		System.out.println(s1);
		System.out.println(s2);
		Student ob= new Student();
		ob.setPer(90);
		
	}
}
