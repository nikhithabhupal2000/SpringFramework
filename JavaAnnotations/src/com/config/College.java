package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource(value = {"classpath:college-details.properties" })
@Component("collegeBean")
public class College {
	
	
	@Value("${collegeName}")
	String collegeName;
	
	@Autowired
	private Princi principal;
	
	@Autowired
	@Qualifier("science")
	private Teacher teacher;
	
	
	
	public void introduce() {
		System.out.println("hello ! I am college");
		System.out.println(collegeName);
		principal.introduce();
		teacher.introduce();
	}

}
