package com.pf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {
	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		JDBC ob = (JDBC) context.getBean("jdbc");
		
		ob.getResults();
	}

}
