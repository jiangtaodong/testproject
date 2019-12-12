package com.djt.testproject;

public class ThreadClass implements Runnable{
	
	int i;
	int j;
	
	@Override
	public void run() {
		
		try {
			
			Thread.sleep(3000);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		i = 100;
		
		System.out.println(j);
		
	}
	
}
