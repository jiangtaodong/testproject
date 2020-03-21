package list;

import java.util.Stack;

public class MyStack {
	
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public MyStack(int s) {

		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
		
	}
	
	public void push(long l) {
		
		stackArray[++top] = l;
		
	}
	
	public long pop() {
		
		return stackArray[top--];
		
	}
	
	public long peek() {
	      return stackArray[top];
	   }
	public boolean isEmpty() {
	      return (top == -1);
	}
	public boolean isFull() {
	      return (top == maxSize - 1);
	}

	public static void main(String[] args) {
		
		MyStack myStack = new MyStack(10);
		
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		
		while(!myStack.isEmpty()) {
			
			System.out.println(myStack.pop());
			
		}

	}

}
