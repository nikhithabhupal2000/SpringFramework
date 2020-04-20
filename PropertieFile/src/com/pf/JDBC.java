package com.pf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;


public class JDBC {

	@Value("${url}")
	private  String url;
	@Value("${un}")
	private  String un;
	@Value("${pwd}")
	private String pwd;
	@Value("${driver}")
	private  String driver;

	//@Value("jdbc:mysql://localhost:3306/employee")
	public  void setUrl(String url) {
		this.url = url;
	}

	//@Value("nikhithabhupal2000")
	public  void setUn(String username) {
		this.un = username;
	}

	//@Value("abpns@2000")
	public  void setPwd(String pwd) {
		this.pwd = pwd;
	}

	//@Value("com.mysql.cj.jdbc.Driver")
	public  void setDriver(String driver) {
		this.driver = driver;
	}

	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	
	public void getResults() throws Exception {
		
		
		try {
			
			//Class.forName(driver);
			
			conn = DriverManager.getConnection(url, un, pwd);
			
			stmt = conn.createStatement();
			
			String msql = "SELECT * FROM emp";
			
			rs = stmt.executeQuery(msql);
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1));
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
