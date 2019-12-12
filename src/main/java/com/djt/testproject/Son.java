package com.djt.testproject;

public class Son extends Father{
	
	public Son(){
		
		System.out.println("Son构造方法!");
		
	}
	
	{
		System.out.println("Son普通代码块");
	}
	
	static{
		System.out.println("Son静态代码块");
	}
	
	public void say() {
		
		System.out.println("Son普通方法");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		Son son = new Son();
		
		Father father = new Father();
		
		father.say();
		
		son.say();
		
		System.out.println("end");
		
	}
	
}
