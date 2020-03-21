package functiondemo;

public class FeiBoNa {

	public static void main(String[] args) {
		
		for(int i = 0; i < 11; i++) {
			
			System.out.println(feiBoNa(i));
			
		}
		
	}

	public static int feiBoNa(int num) {
		
		if(num == 0 || num == 1) {
			
			return num;
			
		}else {
			
			return feiBoNa(num - 1) + feiBoNa(num - 2);
			
		}
		
	}

}
