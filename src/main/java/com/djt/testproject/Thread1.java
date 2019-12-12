package com.djt.testproject;

public class Thread1 implements Runnable{
	
	private static int j = 0;
	
	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public synchronized void run() {
		
		int count = 0;
		
		while(count < 1 ) {
			
			try {
				
				asc();
				
				System.out.println(Thread.currentThread().getName() + " ----------- " + "当前j为：【" + this.getJ() + "】"  + " *** Thread1");
				
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			count++;
			
		}
		
	}
	
	public void asc() {
		
		this.setJ(this.getJ() + 1);
		
	}
	
	public void desc() {
		
		this.setJ(this.getJ() - 1);
		
	};

}
