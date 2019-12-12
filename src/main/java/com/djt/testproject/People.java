package com.djt.testproject;

public class People {
	
	String name;
	
	public People() {
		
		System.out.println("1");
		
	}

	public People(String name) {
		
		this.name = name;
		
		System.out.println("2   " + name);
	}

}
