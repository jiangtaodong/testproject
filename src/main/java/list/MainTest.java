package list;

import java.util.*;
 
public class MainTest {
   private LinkedList list = new LinkedList();
   public void push(Object v) {
      list.addFirst(v);
   }
   public Object top() {
      return list.getFirst();
   }
   public Object pop() {
      return list.removeFirst();
   }
   public static void main(String[] args) {
      MainTest stack = new MainTest();
      for (int i = 30; i < 40; i++)
         stack.push(new Integer(i));
      System.out.println(stack.top());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
   }
}