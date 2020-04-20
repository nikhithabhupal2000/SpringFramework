package com.ioc;

public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling using airtel sim");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing using airtel sim");
	}

}
