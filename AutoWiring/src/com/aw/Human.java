package com.aw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("heart1")
	Heart heart;
	
	public Heart getHeart() {
		return heart;
	}

	
//	@Autowired
//	@Qualifier("heart1")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	

	public Human() {
		super();
	}

	//@Autowired
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	void isAlive(){
		if(heart.pumping() == true ) {
			System.out.println("ALIVE");
		}
		else {
			System.out.println("DEAD");
		}
	}

}
