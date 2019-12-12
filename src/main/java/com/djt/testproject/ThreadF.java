package com.djt.testproject;

public class ThreadF{

	public static void main(String[] args) {
		
		ThreadT1 t1 = new ThreadT1();
		
		ThreadT2 t2 = new ThreadT2();
		
		t1.start();
		
		try {
			t1.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		
	}
	
}
