package java8;

import java.util.function.Supplier;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Supplier是jdk1.8的接口，这里和lamda一起使用了
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }
 
    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }
 
    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }
 
    public void repair() {
        System.out.println("Repaired " + this.toString());
    }
	
	@FunctionalInterface
	public interface Suppliers<T>{
		
		T get();
		
	}

}
