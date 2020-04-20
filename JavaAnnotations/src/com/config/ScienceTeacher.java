package com.config;

import org.springframework.stereotype.Component;

@Component("science")
public class ScienceTeacher implements Teacher{

	@Override
	public void introduce() {
		System.out.println("I am a science Teacherr");
	}
	
	

}
