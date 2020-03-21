package exception;

public class ExceptionTest {

	public static void main(String[] args) {

		try {
			
			int[] a = new int[2];
			
			System.out.println("Access element three :" + a[3]);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Exception thrown  :" + e);
			
		}catch (Exception e) {
			
			System.out.println("********** exception **************");
			
		}
		
		System.out.println("Out of the block");
		
	}

}
