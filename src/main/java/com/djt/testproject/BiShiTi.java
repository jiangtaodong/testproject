package com.djt.testproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.zip.GZIPInputStream;

import org.apache.poi.POIOLE2TextExtractor;
import org.apache.poi.POITextExtractor;
import org.apache.poi.extractor.ExtractorFactory;
import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.formula.functions.Match;


public class BiShiTi {
	
	public static void main(String[] args) {
		
		//华夏基金
		//hxjj1();
		
		//hxjj2();
		
		//hxjj3();
		
		//hxjj4();
		
		//hxjj5();
		
		//阿里
		//al();
		
		//poi解析word、excel、ppt文档
		//testpoi();
		
		//中科软
		//testzkr();
		
		//有谦长伴网络科技有限公司
		//testyqcb();
		
		//新普互联
		//testxphl();
		
		//联系lambda
		//testlambda();
		
		//中国网
		//testzhongguowang();
		
		//联动优势
		//testldys();
		
		//文思海辉
		testwshh();
		
	}

	public static void testwshh() {
		
		int i = 1;
		int j;
		
		j = i++;
		
		System.out.println(i + " ////////////////////////////// " + j);
		
		for(int a = 0; a < 3; a++) {
			
			for(int b = 0; b < 3; b++) {
				
				if(b == 1) {
					
					continue;
					
				}
				
				System.out.println(b);
				
			}
			
		}
		
		System.out.println(" -------------------------------------------- ");
		
		for(int x = 9; x >= 1; x--) {
			
			for(int y = x; y >= 1; y--) {
				
				System.out.print(x + " * " + y + " = " + (x*y) + " /// ");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println(" -------------------------------------------- ");
		
		int e = 1;
		int f = 2;
		int g = e++ + f++ + ++e + ++f;
		
		System.out.println("g = " + g + " , " + "e = " + e + " , " + "f = " + f);
		
		System.out.println(" -------------------------------------------- ");
		
		System.out.println(3*0.1);
		System.out.println(3*0.1 == 0.3);
		
		System.out.println(1*0.3);
		System.out.println(1*0.3 == 0.3);
		
		System.out.println(" -------------------------------------------- ");
		
	}

	public static void testldys() {
		
		int a = 3;
		int b = 1;
		
		//不能通过编译
//		if(a = b) {
//			
//			System.out.println("Not Equals");
//			
//		}else {
//			
//			System.out.println("Equals");
//			
//		}
		
		try {
			
			int i = 0;
			int j = 2;
			
			int k = j / i;
			
//			System.out.println(j / i);
			
			return;
			
		} catch (Exception e) {
			
			System.out.println(" ***************** 这是catch ***************** ");
			
			e.printStackTrace();
			
			return;
			
		}finally {
			
			System.out.println(" ***************** 这是finally ***************** ");
			
		}
		
	}

	public static void testzhongguowang() {
		
		String[] strArr = {"2/1","3/2","4/3","5/2"};
//		System.out.println(strArr.length);
		
		Double[] countArr = new Double[3];
		
		double dcount = 0.00;
		BigDecimal bdCount = BigDecimal.valueOf(0.00);
		
		for(int i = 0; i <= 2; i++) {
			
			String[] newArr = strArr[i].split("/");
			
			double a = Double.parseDouble(newArr[0]);
			
			double b = Double.parseDouble(newArr[1]);
			
			double count = b / a;
			
			countArr[i] = count;
			
			count = 0;
			
		}
		
		for(int j = 0; j < countArr.length; j++) {
			
			if(j == countArr.length) {
				
				break;
				
			}
			
			BigDecimal a = BigDecimal.valueOf(countArr[j]);
			
			bdCount = bdCount.add(a);
			
//			dcount += countArr[j];
			
			System.out.println(countArr[j] + " -------------- ");
			
		}
		
//		System.out.println(Math.round(dcount));
		System.out.println(new DecimalFormat("0.00").format(bdCount));
		
		System.out.println(" ************************************************************************ ");
		
		int count = 1;
		
		float higth = 100f;
		
		while(count <= 3) {
			
			higth = higth / 2;
			
			count++;
			
		}
		
		System.out.println(higth);
		
	}

	public static void testlambda() {

		List<String> list = Arrays.asList("123","456","789");
		
		list.forEach(a -> System.out.println(a));
		
		System.out.println(" ------------------------------------------------------------- ");
		
		list.forEach(System.out::println);
	}

	public static void testxphl() {
		
		System.out.println(" ******************************** List-start ************************************* ");
		
		List<String> list= new ArrayList();
		
		list.add("111");
		list.add("222");
		list.add("333");
		
		System.out.println(" ******************************** List-遍历1 ************************************* ");
		
		for(int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		
		System.out.println(" ******************************** List-遍历2 ************************************* ");
		
		for(String str : list) {
			
			System.out.println(str);
			
		}
		
		System.out.println(" ******************************** List-遍历3 ************************************* ");
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
			
		}
		
		System.out.println(" ******************************** List-end ************************************* ");
		
		System.out.println();
		
		System.out.println(" ******************************** Set-start ************************************* ");
		
		Set<String> set  = new HashSet();//无序，不可重复
		
		Set<String> set2  = new TreeSet<String>();//有序，不可重复
		
		set.add("aaa");
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		set2.add("aaa");
		set2.add("aaa");
		set2.add("bbb");
		set2.add("ccc");
		
		System.out.println(" ******************************** Set-hashset-遍历1-无序，不可重复  ************************************* ");
		
		for(String setstr : set) {
			
			System.out.println(setstr);
			
		}
		
		System.out.println(" ******************************** Set-hashset-遍历2-无序，不可重复  ************************************* ");
		
		Iterator<String> iteratorset = set.iterator();
		
		while(iteratorset.hasNext()) {
			
			System.out.println(iteratorset.next());
			
		}
		
		System.out.println(" ******************************** Set-treeset-遍历1-有序，不可重复  ************************************* ");
		
		for(String treesetstr : set2) {
			
			System.out.println(treesetstr);
			
		}
		
		System.out.println(" ******************************** Set-treeset-遍历2-有序，不可重复  ************************************* ");
		
		Iterator<String> iteratorset2 = set2.iterator();
		
		while(iteratorset2.hasNext()) {
			
			System.out.println(iteratorset2.next());
			
		}
		
		System.out.println(" ******************************** Set-end ************************************* ");
		
		System.out.println();
		
		System.out.println(" ******************************** Map-start ************************************* ");
		
		Map<String,String> map = new HashMap();
		
		map.put("1", "aaa");
		map.put("2", "bbb");
		map.put("3", "ccc");
		
		System.out.println(" ******************************** Map-遍历1 ************************************* ");
		
		for(Entry<String, String> entry : map.entrySet()) {
			
			System.out.println(entry.getKey() + " ----- " + entry.getValue());
			
		}
		
		System.out.println(" ******************************** Map-遍历2 ************************************* ");
		
		Iterator<Entry<String, String>> iteratormap = map.entrySet().iterator();
		
		while(iteratormap.hasNext()) {
			
			System.out.println(iteratormap.next());
			
		}
		
		System.out.println(" ******************************** Map-end ************************************* ");
		
	}

	public static void testyqcb() {
		
		int k = 0;
		int rest = ++k + k++ + ++k + k;
		
		System.out.println(k);
		System.out.println(rest);
		
	}

	public static void testzkr() {
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= i; j++ ) {
				
				System.out.print(j + " * " + i + " = " + (j * i) + " // ");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		String a = "helloworld";
		String b = new String("hello" + "world");
		
		System.out.println(a == b);
		
		System.out.println();
		
		String targetstr = "abcegddabc2568541abc";
		int count = 0;
		
		char[] arrstr = targetstr.toCharArray();
		
		for(int k = 0; k < arrstr.length; k++) {
			
			if(arrstr[k = k] == 'a' && arrstr[k = k + 1] == 'b' && arrstr[k = k + 1] == 'c') {
				
				count++;
				
			}else {
				
				continue;
				
			}
			
		}
		
		System.out.println("abc 出现了【" + count + "】 次");
		
	}

	public static void testpoi() {
		
		File file = new File("D:\\安装包\\MySQL5.7.23解压版安装教程.docx");
		
		try {
			
			FileInputStream fis = new FileInputStream(file);
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

	public static void al() {
		
		String a = "ab";
		String b = "a" + "b";
		
		System.out.println(a == b);
		
		System.out.println(" --------------------------------- ");
		
		List<String> list = new ArrayList<String>();

	    List<Integer> li = new ArrayList<Integer>();
	    
	    System.out.println(list.getClass());
	    System.out.println(li.getClass());

	    if(list.getClass() == li.getClass()) {

	           System.out.println(true);

	    }else{

	           System.out.println(false);
	 
	    }

	    System.out.println(" --------------------------------- ");
	    
	    String ipAddr = "87.192.255.255";
		
		String[] splitStr = null; 
			
		splitStr = ipAddr.split("\\.");//.为中文
		
		if(splitStr.length == 4) {
			
			//校验每位是否是0-255之间的数
			for(int i = 0; i < splitStr.length; i++) {
				
				if(Integer.parseInt(splitStr[i]) < 0 || Integer.parseInt(splitStr[i]) > 255) {
					
					System.out.println(Integer.parseInt(splitStr[i]));
					
					System.out.println("这不是一个IPV4地址");
					
					break;
					
				}else {
					
					if(i == splitStr.length - 1) {
						
						System.out.println("这是一个IPV4地址");
						
					}else {
						
						continue;
						
					}
					
				}
				
			}
			
		}else {
			
			System.out.println("这不是一个IPV4地址");
			
		}
		
	}

	public static void hxjj5() {
		
		//String s;
		
		//System.out.println("s = " + s); //编译不通过
		
	}

	public static void hxjj4() {
		
		try {
			
			File file = new File("d://a.txt");
			
			InputStream inputStream = null;
			
			new BufferedWriter(new FileWriter(file));
			
			new BufferedReader(new InputStreamReader(inputStream));
			
			new ObjectInputStream(new FileInputStream(file));
			
			new GZIPInputStream(new FileInputStream(file));
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

	private static void hxjj3() {
		
		String str = "24ab_2t2";
		
		StringBuffer sb = new StringBuffer();
		
		char[] charArr = new char[str.length()];
		
		System.out.println("当前字符为：【" + str.charAt(4) + "】");
		
		System.out.println('a' == '0');
		
		for(int a = 0; a < charArr.length; a++) {
			
			charArr[a] = str.charAt(a);
			
		}
		
//		for(char c : charArr) {
//			
//			System.out.println(c);
//			
//		}
		
		for(int i = 0; i < charArr.length; i++) {
			
			if(charArr[i] >= '0' && charArr[i] <= '9') {
				
//				System.out.println(charArr[i]);
				
				int count = Integer.sum(Integer.parseInt(String.valueOf(charArr[i])) , 1) ;
				
				while(count >= 0) {
					
					if(count != 0) {
						
						sb.append(charArr[i+1]);
						
					}
					
					count--;
					
				}
				
			}
			
		} 
		
		System.out.println(sb);
		
	}
	
	public static void hxjj2() {
		
		Thread t = new Thread() {
			
			public void run() {
				
				pong();
				
			}
			
		};
		
		t.run();
		
		System.out.println("ping");
		
	}
	
	public static void pong() {
		
		System.out.println("pong");
		
	}

	public static void hxjj1() {
		
		String str1 = "hello";
		String str2 = "he" + new String("llo");
		String str3 = "helloworld";
		String str4 = "hello" + "world";
		
		//测试查看jdk源码  - 开始
		List list1 = new ArrayList();
		
		list1.add(" 0000 ");
		
		List list2 = new LinkedList();
		
		List list3 = new Vector();
		
		Map<String,String> map1 = new HashMap<String,String>();
		
		map1.put("1", "00000000000");
		map1.put("2", "11111111111");
		map1.put(null, "12356889452");
		map1.put("", "12356889452");
		
		System.out.println(" ******************************************************** ");
		
		for(String str : map1.keySet()) {
			
			System.out.println("key: ");
			System.out.println(str);
			System.out.println("value: ");
			System.out.println(map1.get(str));
			System.out.println();
			
		}
		
		System.out.println(" ******************************************************** ");
		
		System.out.println(3 + 6 + "9");
		
		System.out.println(" ******************************************************** ");
		
		System.out.println(" --------------------------------- ");
		
		System.out.println(map1.get(""));
		
		System.out.println(" --------------------------------- ");
		
		Map map2 = new Hashtable();
		//测试查看jdk源码  - 结束
		
		System.err.println(str1 == str2);
		System.out.println(" -------------------------- ");
		System.out.println((str3 == str4) + " ********** ");
		System.out.println(" -------------------------- ");
		
		
	}

}
