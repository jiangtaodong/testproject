package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("张三");
		list.add("王五");
		list.add("李四");
		
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
		});
		
		for(String strl : list) {
			
			System.out.println(strl);
			
		}
			
		for(int i = 0; i < list.size(); i ++) {
			
			System.out.println(list.get(i));
			
		}
		
		System.out.println(" --------------------------------------------------------- ");
		
		for(String s : list) {
			
			System.out.println(s);
			
		}
		
		System.out.println(" --------------------------------------------------------- ");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		System.out.println(" --------------------------------------------------------- ");
		
		String[] strArr = new String[list.toArray().length];
		
		list.toArray(strArr);
		
		for(int a = 0; a < strArr.length; a++) {
			
			System.out.println(strArr[a]);
			
		}
		
		System.out.println(" --------------------------------------------------------- ");
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "麦克");
		map.put(102, "汤姆");
		map.put(103, "艾米");
		
		for(Integer in : map.keySet()) {
			
			System.out.println(map.get(in) + " --------- " + in);
			
		}
		
		System.out.println(" --------------------------------------------------------- ");
		
		Iterator<Entry<Integer,String>> itmap = map.entrySet().iterator();
		
		while(itmap.hasNext()) {
			
			System.out.println(itmap.next());
			
		}
		
		System.out.println(" --------------------------------------------------------- ");
		
		for(Entry<Integer, String> emap : map.entrySet()) {
			
			System.out.println(emap);
			
		}
		
		System.out.println(" --------------------------------------------------------- ");
		
		for(String strvalue : map.values()) {
			
			System.out.println(strvalue);
			
		}
		
		System.out.println(" --------------------------------------------------------- ");

	}

}
