package com.di;

public class Student {
	
	private String studentName;
	private int id;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student(String studentName, int id) {
		this.studentName = studentName;
		this.id = id;
	}
	public Student(int id) {
		this.id = id;
	}
	public Student() {
	}
	
	

}
