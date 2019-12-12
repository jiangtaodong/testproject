package com.djt.testproject;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class TestJsoup {
	
	public static void main(String args[]) {
		
		test1();
		
	}

	public static void test1() {
		
		try {
			
			Document document = Jsoup.connect("https://news.163.com/").get();
			
			System.out.println(" -----------------------------------------------------  ");
			
			Elements elements = document.select(".mod_top_news2 a[href]");
			
			for(int i = 0 ; i < elements.size(); i++) {
				
				System.out.println(elements.get(i).text());
				
			}
			
			System.out.println(" -----------------------------------------------------  ");
			
			System.out.println(" ********************************************** ");
			
			System.out.println("一共有：【" + elements.size() + "】条热点新闻");
			
			System.out.println(" ********************************************** ");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
	}

}
