package functiondemo;

public class JieCheng {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println(count(i));
			
		}
		
		StringBuffer str = new StringBuffer("hello");
		
		System.out.println(str.charAt(0));
		
		str.setCharAt(2, 'o');
		
		System.out.println(str);

		System.out.println(" --------------------------------------- ");
		
		A:
		for(int i = 0; i < 10; i++) {
			
			B:
			for(int j = 0; j < 10; j++) {
				
				System.out.println(j);
				
				if(j == 1) {
					
					break A;
					
				}
				
			}
			
		}
		
	}

	public static int count(int num) {
		
		if(num == 0) {
			
			return 1;
			
		}else {
			
			return num * count(num - 1);
			
		}
		
	}

}
