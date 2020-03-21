package genericsorfanxing;

public class GenericMethodTest {

	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3};
		
		Double[] darr = {0.0,1.2,1.3};
		
		Character[] carr = {'a','b','c'};
		
		printArray(arr);
		printArray(darr);
		printArray(carr);
		
	}

	public static < E > void printArray(E[] inputarr) {
		
		for(E e : inputarr) {
			
			System.out.println(e);
			
		}
		
	}

}
