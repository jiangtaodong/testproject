package com.djt.testproject;

public class ThreadT1 extends Thread{
	
	private boolean status = false;
	
	@Override
	public void run() {
		
		if(!status) {
			
			System.out.println("ThreadT1 --------------------------- ");
			
		}
		
	}

}
