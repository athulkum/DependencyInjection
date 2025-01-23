package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		Laptop laptop = new Laptop();
//		Student student = new Student(laptop);
//		student.doStudy()	
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	   Student student =  context.getBean("Student",Student.class);
	student.doStudy();
	}
	
	
}
