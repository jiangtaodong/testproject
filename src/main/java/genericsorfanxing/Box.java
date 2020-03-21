package genericsorfanxing;

public class Box<T> {
	
	private T t;
	
	private void add(T t) {
		
		this.t = t;
		
	}
	
	private T get() {
		
		return t;
		
	}
	
	public static void main(String[] args) {
		
		Box<Integer> b1 = new Box<Integer>();
		
		b1.add(123);
		
		System.out.println(b1.get());
		
		Box<String> b2 = new Box<String>();
		
		b2.add("董江涛");
		
		System.out.println(b2.get());
		
	}

}
