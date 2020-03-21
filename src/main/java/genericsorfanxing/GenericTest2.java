package genericsorfanxing;

import java.util.ArrayList;
import java.util.List;

public class GenericTest2 {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		List<String> l2 = new ArrayList<String>();
		List<Character> l3 = new ArrayList<Character>();
		
		l1.add(000);
		l1.add(111);
		l1.add(222);
		
		l2.add("aaa");
		l2.add("bbb");
		l2.add("ccc");
		
		l3.add('h');
		l3.add('i');
		l3.add('j');
		
		getdata(l1);
		getdata(l2);
		getdata(l3);
		
		getNumber(l2);

	}

	public static void getdata(List<?> data) {
		
		for(int i = 0 ; i < data.size(); i ++) {
			
			System.out.println(data.get(i));
			
		}
		
	}
	
	public static void getNumber(List<? extends String> getN) {
		
		for(int i = 0 ; i < getN.size(); i ++) {
			
			System.out.println(getN.get(i));
			
		}
		
	}

}
