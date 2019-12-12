package com.djt.testproject;

public class StartThread {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		
		Thread2 t2 = new Thread2();
		
		Thread thread1 = new Thread(t1);
		
		Thread thread2 = new Thread(t2);
		
		Thread thread3 = new Thread(t1);
		
		Thread thread4 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
			
	}
	
}
