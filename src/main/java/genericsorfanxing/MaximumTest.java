package genericsorfanxing;

public class MaximumTest {

	public static void main(String[] args) {
		
		System.out.println(maxinum(1,2,3));
		System.out.println(maxinum(5,2,6));
		System.out.println(maxinum(12,0,1));
		
		String a = "1",b = "3";
		
		System.out.println(a.compareTo(b));

	}

	public static <T extends Comparable<T>> T maxinum(T x,T y,T z) {
		
		T max = x;
		
		if(y.compareTo(max) > 0) {
			
			max = y;
			
		}
		
		if(z.compareTo(max) > 0) {
			
			max = z;
			
		}
		
		return max;
	}

}
