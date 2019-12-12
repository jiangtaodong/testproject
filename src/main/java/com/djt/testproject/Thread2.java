package com.djt.testproject;

public class Thread2 extends Thread1 implements Runnable{
	
	public synchronized void run() {
		
		int count = 0;
		
		while(count < 1) {
					
			try {
				
				super.desc();
				
				System.out.println(Thread.currentThread().getName() + " ----------- " + "当前j为：【" + super.getJ() + "】" + " *** Thread2");
				
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			count++;
					
		}
		
	}

}
