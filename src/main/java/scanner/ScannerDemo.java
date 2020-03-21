package scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入：");
		
		/**
		 * hasnext()
		 */
//		sc.hasNext();
//	
//		String str = sc.next();		
		
		/**
		 * nextline()
		 */
		sc.hasNextLine();
		
		String str = sc.nextLine();
		
		System.out.println(str);

	}

}
