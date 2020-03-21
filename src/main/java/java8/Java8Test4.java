package java8;

import java.util.Optional;

public class Java8Test4 {

	public static void main(String[] args) {
		
		Java8Test4 j84 = new Java8Test4();
		
		Integer a = null;
		
		Integer b = 123;
		
		Optional<Integer> op = Optional.ofNullable(a);
		
		System.out.println(op);
		
		Optional<Integer> op2 = Optional.of(b);
		System.out.println(op2);
		
		System.out.println(sum(op,op2));
		
	}

	private static  Integer sum(Optional<Integer> op, Optional<Integer> op2) {

		System.out.println("第一个参数值存在: " + op.isPresent());
	    System.out.println("第二个参数值存在: " + op2.isPresent());
	    
	    Integer value1 = op.orElse(new Integer(0));
	    Integer value2 = op2.get();
		
		return value1 + value2;
	}

}
