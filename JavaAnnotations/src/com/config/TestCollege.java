package com.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCollege {
	public static void main(String[] args) {
		
		ApplicationContext context  = new AnnotationConfigApplicationContext(CollegeConfig.class);
		
		College c = (College) context.getBean("collegeBean");
		
	/*	Princi p = (Princi) context.getBean("princi");
		
		p.introduce();
		*/
		c.introduce();
	}

}	
