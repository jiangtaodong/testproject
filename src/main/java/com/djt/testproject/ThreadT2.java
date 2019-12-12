package com.djt.testproject;

public class ThreadT2 extends Thread {
	
	private boolean status = false;
	
	@Override
	public void run() {
		
		status = true;
		
		while(status) {
			
			System.out.println("**********************************");
			
		}
		
		System.out.println("ThreadT2 --------------------------- ");
		
	}

}
