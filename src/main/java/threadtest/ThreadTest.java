package threadtest;

public class ThreadTest extends Thread {
	
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

		ThreadTest tt = new ThreadTest();
		
		tt.setName("Thread");
		
		System.out.println("before start(), tt.isAlive()=" + tt.isAlive());
		 
	    tt.start();
	    
	    System.out.println("just after start(), tt.isAlive()=" + tt.isAlive());
	    
	    for (int i = 0; i < 10; i++) {
	         tt.printMSg();
	      }
	      System.out.println("The end of main(), tt.isAlive()=" + tt.isAlive());
		
	}

}
