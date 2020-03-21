package threadtest;

public class ThreadTest2 extends Thread {
	
	@Override
	public void run() {

		for(int i = 0; i < 100; i++) {
			
			printMSg();
			
		}
		
	}

	public void printMSg() {

		Thread t = Thread.currentThread();
		
		String getName = t.getName();
		
		System.out.println("name  = " + getName);
		
	}

	public static void main(String[] args) {

		ThreadTest2 tt = new ThreadTest2();
		
		tt.start();
		
		for(int i = 0; i < 100; i++) {
			
			tt.printMSg();
			
		}
		
	}

}
