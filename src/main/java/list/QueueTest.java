package list;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	
	public static void main(String[] args) {

		Queue<String> queue= new LinkedList<String>();
		
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		queue.offer("d");
		queue.offer("e");
		
		for(String s : queue) {
			
			System.out.println(s);
			
		}
		
		System.out.println("===");
        System.out.println("poll="+queue.poll()); //返回第一个元素，并在队列中删除
        System.out.println("===");
        for(String q : queue){
            System.out.println(q);
        }
        
        System.out.println("===");
        System.out.println("element="+queue.element()); //返回第一个元素
        System.out.println("===");
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek="+queue.peek()); //返回第一个元素
        System.out.println("===");
        for(String q : queue){
            System.out.println(q);
        }
        
        System.out.println("===");
        Hashtable ht = new Hashtable();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");
//        Enumeration e = ht.keys();
//        while (e.hasMoreElements()){
//           System.out.println(e.nextElement());
//        }
        Enumeration<String> e = ht.keys();
        
        while(e.hasMoreElements()) {
        	
        	System.out.println(e.nextElement());
        	
        }
        
	}

}
