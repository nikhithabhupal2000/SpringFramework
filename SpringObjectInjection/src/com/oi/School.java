package com.oi;

public class School {
	
	int sid;
	ClassRoom c;
	
	void getClasses() {
		
		System.out.println(c.getId());
		
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public ClassRoom getC() {
		return c;
	}

	public void setC(ClassRoom c) {
		this.c = c;
	}
	

}
