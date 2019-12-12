package com.djt.testproject;

public class ThreadClassImpl {

	public static void main(String[] args) {
		
		ThreadClass tc = new ThreadClass();
		
		Thread t = new Thread(tc);
		
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tc.j = 100;
		
	}
	
}
