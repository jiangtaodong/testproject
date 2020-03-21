package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("abc");
		list.add("def");
		list.add("ghi");
		
		list.forEach(System.out::println);
		
		System.out.println(" ----------------------------------------------- ");
		
		List<Integer> lst = Arrays.asList(1,3,5,4,6,9,8);
		
		eval(lst, in -> true);
		
		System.out.println();
		System.out.println(" ----------------------------------------------- ");
		
		eval(lst, in -> in % 2 == 0);
		
		System.out.println();
		System.out.println(" ----------------------------------------------- ");
		
		eval(lst, in -> in > 3);
	}

	public static void eval(List<Integer> lst,Predicate<Integer> predicate) {
		
		for(Integer in : lst) {
			
			if(predicate.test(in)) {
				
				System.out.print(in + " ");
				
			}
			
		}
		
	}

}
