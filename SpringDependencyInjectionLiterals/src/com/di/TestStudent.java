package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s1 = (Student) context.getBean("nikhitha");
		System.out.println(s1.getStudentName());
		System.out.println(s1.getId());
		
		Student s2 = (Student)context.getBean("sai");
		System.out.println(s2.getId());
		System.out.println(s2.getStudentName());
		
		
	}

}
