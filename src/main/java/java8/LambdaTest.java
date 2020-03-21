package java8;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class LambdaTest {
	
	final static String say = "Hi";

	public static void main(String[] args) {
		
		final int num = 1;
		
		LambdaTest lt = new LambdaTest();
		
		print p = message -> System.out.println("hello " + message);
		
		p.message("world");
		
		print p2 = (message) -> System.out.println("hello " + message);
		
		p2.message("google");
		
		math m = (int a, int b) -> a + b;
		
		math m2 = (int a, int b) -> {return a * b; };
		
		math m3 = (int a, int b) -> a / b;
		
		System.out.println(lt.operation(1, 2, m));
		System.out.println(lt.operation(1, 2, m2));
		System.out.println(lt.operation(1, 2, m3));
		
		say sa = (msg) -> System.out.println("say : " + say + " ---- " + msg);
		
		sa.msg("你好");
		
		Converter<Integer,String> con = (param) -> System.out.println(param + num);
		con.conv(2);
		
	}

	interface print {
		
		void message(String message);
		
	}
	
	interface math{
		
		int operation(int a,int b);
		
	}
	
	interface say{
		
		void msg(String msg);
		
	}
	
	interface Converter<T1,T2>{
		
		void conv(int i);
		
	}
	
	public int operation(int a, int b, math math) {
		return math.operation(a, b);
	}
	
}
