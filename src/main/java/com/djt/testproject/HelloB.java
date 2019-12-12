package com.djt.testproject;

public class HelloB extends HelloA{
	
	public HelloB(){
		
		System.out.println("HelloB");
		
	}
	
	{
		
		System.out.println("I'm HelloB");
		
	}
	
	static {
		
		System.out.println("static B");
		
	}
	
	public static void main(String[] args) {
		
		new HelloB();
		
	}

}
