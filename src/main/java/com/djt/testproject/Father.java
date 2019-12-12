package com.djt.testproject;

public class Father {
	
	public Father() {
		
		System.out.println("Father构造方法!");
		
	}
	
	{
		System.out.println("Father普通代码块");
	}
	
	static{
		System.out.println("Father静态代码块");
	}
	
	public void say() {
		
		System.out.println("Father普通方法");
		
	}

}
