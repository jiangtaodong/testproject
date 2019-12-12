package com.djt.testproject;

public class Fa extends People{
	
	String father;

	public Fa() {
		System.out.println("3");
	}

	public Fa(String father) {
		
		this.father = father;
		
		System.out.println("4   " + father);
	}
	
	public static void main(String[] args) {
		
		new Fa("father");
		
	}
	
}
