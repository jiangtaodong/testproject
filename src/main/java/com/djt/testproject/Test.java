package com.djt.testproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.Map.Entry;

import com.mysql.jdbc.Connection;

public class Test {
	
	public static void main(String[] args) {
		
//		unit1();
		
//		unit2();
		
//		unit3();
		
//		digui(3,0,0);
		
//		m(9);
		
		unit5();
		
	}

	public static void unit5() {
		
		List<String> list1 = new ArrayList<String>();
		
		List<String> list2 = new LinkedList<String>();
		
		List<String> list3 = new Vector<String>();
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "zhangsan");
		map.put("b", "lisi");
		map.put("c", "wangwu");
		
		for(String s : map.keySet()) {
			
			System.out.println(s + " ====================== " + map.get(s));
			
		}
		
		System.out.println(" ============================================================================================== ");
		
		for(Entry<String, String> e: map.entrySet()) {
			
			System.out.println(e.getKey() + " ====================== " + e.getValue());
			
		}
		
		System.out.println(" ============================================================================================== ");
		
		Iterator<Entry<String, String>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Entry<String, String> et = it.next();
			String key = et.getKey();
			String value = et.getValue();
			System.out.println(key + " ====================== " + value);
			
		}
		
		System.out.println(" ============================================================================================== ");
		
		for(String k : map.keySet()) {
			
			System.out.println(" ==========key============ ");
			
			System.out.println(k);
			
			System.out.println(" ====================== ");
			
		}
		
		for(String v : map.values()) {
			
			System.out.println(" ==========value============ ");
			
			System.out.println(v);
			
			System.out.println(" ====================== ");
			
		}
		
		System.out.println(" ============================================================================================== ");
		
	}

	public static void m(int i) { 
	    if (i == 1) { 
	      System.out.println("1*1=1 "); 
	    } else { 
	      m(i - 1); 
	      for (int j = 1; j <= i; j++) { 
	        System.out.print(j + "*" + i + "=" + j * i + " "); 
	      } 
	      System.out.println(); 
	    } 
	}  
	
	public static void digui(int i,int count,int js) {
		
		if(i == 0) {
			
			return;
			
		}else {
			
			if(js == 0) {
				
				digui(i--,count = i,js++);
				
			}else {
				
				count *= i;
				
				System.out.println(count);
				
			}
			
		}
		
	}

	public static void unit3() {
		
		String a = "abc";
		String b = new String(a);
		
//		int c =d= 5;
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println();
		
		try{
			
			InputStream is = new FileInputStream("");
			
		}catch (IOException ie) {
			
			System.out.println("IOException ----------- ");
			
		}catch (Exception e) {
		
			System.out.println("Exception -------------- ");
			
		}
		
	}

	public static void unit2() {
		
		Connection conn = null;
		
		try {
			
//			Class.forName("com.mysql.jdbc.Driver");	
			
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "root");
			
			String sql = "select * from emp";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			List<Emp> list = new ArrayList<Emp>();
			
			while(rs.next()) {
				
				int empId = rs.getInt("emp_id");
				String empName = rs.getString("emp_name");
				int empSal = rs.getInt("emp_sal");
				
				Emp emp = new Emp();
				
				emp.setEmpId(empId);
				emp.setEmpName(empName);
				emp.setEmpSal(empSal);
				
				list.add(emp);
				
			}
			
			for(Emp estr : list) {
				
				System.out.println(estr.getEmpId() + " --------------------- " + estr.getEmpName() + " ---------------------------- " + estr.getEmpSal());
				
			}
			
			rs.close();
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void unit1() {
		
		String a = "abc";
		
		String b = new String("abc");
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		System.out.println(a.equals(b));
		System.out.println(a == b);
		
		Object o = "abcdefg";
	
		
	}
	
}
