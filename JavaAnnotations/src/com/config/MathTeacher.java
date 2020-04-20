package com.config;

import org.springframework.stereotype.Component;

@Component("maths")
public class MathTeacher implements Teacher{

	@Override
	public void introduce() {
		System.out.println("I am Math Teacher");
	}
	
	

}
