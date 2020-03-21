package tuxing;

public class TuXingTest {

	public static void main(String[] args) {

		tuxing1();
		
		tuxing2();
		
		tuxing3();

	}

	public static void tuxing2() {
		
		System.out.println(" ------------------------------------------------------------------------ ");
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print(j + " * " + i + " = " + (j * i) + " / ");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println(" ------------------------------------------------------------------------ ");
		
	}

	public static void tuxing1() {
		
		System.out.println(" ------------------------------------------------------------------------ ");
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print(" * ");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println(" ------------------------------------------------------------------------ ");
		
		for(int i = 1; i <= 5; i++) {
			
			for(int a = i; a <= 5; a++) {
				
				System.out.print("-");
				
			}
			
			for(int j = 1; j <= 5; j++) {
				
				System.out.print(" * ");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println(" ------------------------------------------------------------------------ ");
			
			for(int i = 1; i <= 5; i++) {
				
				for(int a = 1; a <= 5; a++) {
					for(int s=1;s<=2;s++) {
						System.out.print(" ");
					}
					
				}
				
				for(int j = 5+i; j >= 1; j--) {
					
					System.out.print(" * ");
					
				}
				
				System.out.println();
				
			}
	
		
		
	}
	
	public static void tuxing3() {
		
		System.out.println(" ------------------------------1--------------------------------------- ");
		
		for(int i = 1; i <= 7; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print(" * ");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println(" ------------------------------------------------------------------------ ");
		
		System.out.println(" ------------------------------3--------------------------------------- ");
		
		for(int i = 1; i <= 7; i++) {
			
			for(int a = i; a <= 7; a++) {
				
				System.out.print("  ");
				
			}
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print(" * ");
				
			}
			
			System.out.println();
			
		}
		
//		for(int i = 7; i >= 1; i--) {
//			
//			for(int a = i; a <= 7; a++) {
//				
//				System.out.print("  ");
//				
//			}
//			
//			for(int j = 7; j >= i; j--) {
//				
//				System.out.print(" * ");
//				
//			}
//			
//			System.out.println();
//			
//		}
		
		System.out.println(" ------------------------------------------------------------------------ ");
		
	}

}
