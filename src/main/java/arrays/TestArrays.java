package arrays;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestArrays {

	public static void main(String[] args) {
		
		int[] intarr = {-1,9,5,4,1,6,3};

		int straddress = Arrays.binarySearch(intarr, 16);
		
		System.out.println(straddress + "---");
		
		System.out.println(" ------------------------------------------------- ");
		
		Arrays.sort(intarr);
		
		for(int i = 0; i < intarr.length; i++) {
			
			System.out.println(intarr[i]);
			
		}
		
		System.out.println(" ------------------------------------------------- ");
		
		test();
		
		test2();
		
		test3();
		
		test4();
		
		test5();
		
		test6();
		
		test7();
		
		test8();
		
		test9();
		
		test10();
		
		test11();
		
		test12();
		
		test13();
		
	}

	public static void test() {
		
		int[] num = {1,6,2,4,5,3};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < num.length; i++) {
			
			list.add(num[i]);
			
		}
		
		for(int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		
	}
	
	public static void test2() {
		
		System.out.println(" ------------------------------------------------- ");
		
		Integer[] num = {1,6,2,4,5,3};
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(num));
		
		Collections.reverse(list);
		
		for(int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		
		System.out.println(" ------------------------------------------------- ");
		
	}
	
	public static void test3() {
		
		System.out.println(" ------------------------------------------------- ");
		
		Integer[] num = {1,6,2,4,5,3};
		
		Integer s1 = Collections.min(Arrays.asList(num));
		
		System.out.println("min ----- " + s1);
		
		Integer s2 = Collections.max(Arrays.asList(num));
		
		System.out.println("max ----- " + s2);
		
		System.out.println(" ------------------------------------------------- ");
		
	}
	
	public static void test4() {
		
		System.out.println(" ------------------------------------------------- ");
		
		Integer[] a = {1,2,3};
		
		Integer[] b = {4,5,6};
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(a));
		
//		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(b));
//		
//		l1.addAll(l2);
		
		l1.addAll(Arrays.asList(b));
		
		Object[] c = l1.toArray();
		
		for(int i = 0; i < c.length; i++) {
			
			System.out.println(c[i]);
			
		}
		
		System.out.println(" ------------------------------------------------- ");
		
	}
	
	public static void test5() {
		
		System.out.println(" ------------------------------------------------- ");
		
		byte[] data = {0,0,0};
		
		byte[] a = new BigInteger("123").toByteArray();
		byte[] b = new BigInteger("123").toByteArray();
		byte[] c = new BigInteger("123").toByteArray();
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream(16 + data.length);
		
		try {
			baos.write(a);
			baos.write(b);
			baos.write(c);
			baos.write(data);
			baos.flush();
			
			byte[] byarr = baos.toByteArray();
			
			for(int i = 0; i < byarr.length; i++) {
				
				System.out.println(byarr[i]);
				
			}
			
			baos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(" ------------------------------------------------- ");
		
	}
	
	public static void test6() {
		
		System.out.println(" ------------------------------------------------- ");
		
		Integer[] in = new Integer[5];
		
		Arrays.fill(in, 10086);
		
		for(int i = 0; i < in.length; i++) {
			
			System.out.println(in[i]);
			
		}
		
		System.out.println(" --------------");
		
		Arrays.fill(in, 3, 5, 10010);
		
		for(int i = 0; i < in.length; i++) {
			
			System.out.println(in[i]);
			
		}
		
		System.out.println(" ------------------------------------------------- ");
		
	}
	
	public static void test7() {
		
		System.out.println(" ------------------------------------------------- ");
		
		String[] a = {"a","b","c"};
		
		String[] b = new String[5];
		
		b[3] = "D";
		b[4] = "E";
		
		System.arraycopy(a, 0, b, 0, 3);
		
		for(int i = 0; i < b.length; i++) {
			
			System.out.println(b[i]);
			
		}
		
		System.out.println(" ------------------------------------------------- ");
		
	}
	
	public static void test8() {
		
		System.out.println(" ------------------------------------------------- ");
		
		Integer[] in = {1,2,2,3,3,3};
		
		for(int i = 0; i < in.length; i++) {
			
			int count = 0;
			
			for(int j = i + 1; j < in.length; j++) {
				
				if(in[i] == in[j]) {
					
					count++;
					
					break;
					
				}
				
			}
			
			if(count == 1) {
				
				System.out.println("重复数为：   "+ in[i]);
				
				count = 0;
				
			}
			
		}
		
		System.out.println(" ------------------------------------------------- ");
		
	}
	
	public static void test9() {
		
		System.out.println(" ------------------------------------------------- ");
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(0);
		l1.add(1);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(0);
		l2.add(1);
		l2.add(2);
		
		System.out.println(l1);
		System.out.println(l2);
		
		l2.removeAll(l1);
		
		System.out.println(l2);
		
		System.out.println(" ------------------ ");
		
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		l3.add(0);
		l3.add(1);
		ArrayList<Integer> l4 = new ArrayList<Integer>();
		l4.add(0);
		l4.add(1);
		l4.add(2);
		
		System.out.println(l3);
		System.out.println(l4);
		
		l2.removeAll(l1);
		
		System.out.println(l2);
		
		System.out.println(" ------------------------------------------------- ");
		
	}
	
		public static void test10() {
		
		System.out.println(" ------------------------------------------------- ");
		
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		l3.add(0);
		l3.add(1);
		ArrayList<Integer> l4 = new ArrayList<Integer>();
		l4.add(0);
		l4.add(1);
		l4.add(2);
		
		System.out.println(l3);
		System.out.println(l4);
		
		l4.retainAll(l3);
		
		System.out.println(l4);
		
		System.out.println(" ------------------------------------------------- ");
		
	}
		
	public static void test11() {
			
			System.out.println(" ------------------------------------------------- ");
			
			ArrayList<Integer> l3 = new ArrayList<Integer>();
			l3.add(0);
			l3.add(1);
			ArrayList<Integer> l4 = new ArrayList<Integer>();
			l4.add(0);
			l4.add(1);
			l4.add(2);
			
			System.out.println(l3);
			System.out.println(l4);
			
			System.out.println(l3.contains(2));
			
			System.out.println(l4.contains(2));
			
			System.out.println(" ------------------------ ");
			
			List<Integer> l1 = new ArrayList<Integer>();
			l1.add(0);
			l1.add(1);
			List<Integer> l2 = new ArrayList<Integer>();
			l2.add(0);
			l2.add(1);
			l2.add(2);
			
			System.out.println(l1);
			System.out.println(l2);
			
			System.out.println(l2.containsAll(l1));
			
			System.out.println(l1.containsAll(l2));
			
			System.out.println(" ------------------------------------------------- ");
			
		}
	public static void test12() {
		
		System.out.println(" ------------------------------------------------- ");
		
		Integer[] a = {1,2,3};
		
		Integer[] b = {1,2,3,4};
		
		System.out.println(Arrays.equals(a, b));
		
		System.out.println(" ------------------------------------------------- ");
		
	}
	
	public static void test13() {
		
		System.out.println(" ------------------------------------------------- ");
		
		Integer[] a = {1,2,3};
		
		Integer[] b = {1,2,3,4};
		
		Integer[] pointun = union(a,b);
		
		for(int i = 0; i < pointun.length; i++) {
			
			System.out.println(pointun[i]);
			
		}
		
		System.out.println(" ------------------------------------------------- ");
		
	}

	public static Integer[] union(Integer[] a, Integer[] b) {

		Set<Integer> set = new HashSet<Integer>();
		
		for(Integer in1 : a) {
			
			set.add(in1);
			
		}
		
		for(Integer in2 : b) {
			
			set.add(in2);
			
		}
		
		Integer[] inarr = {};
		
		return set.toArray(inarr);
		
	}
	
}
