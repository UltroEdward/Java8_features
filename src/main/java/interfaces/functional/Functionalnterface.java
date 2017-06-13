package interfaces.functional;

public class Functionalnterface {

	public static void main(String[] args) {
		
		FuncInterface func = (a, b) -> {
			System.out.println(a + b);
		};
		
		func = (a, b) -> System.out.println(a + b);
		
		func.doSmth("Hi ", 5);

	}

}

@FunctionalInterface // compile-time check
interface FuncInterface {

	// main abstract method
	public void doSmth(String s, Integer i);

	// more than 2 abstract methods in @FunctionalInterface => compilation error
	// public void doSmth2(String s, Integer i);

	// default method
	default void helloWorld() {
		System.out.println("Default implementation of method");
	}

	// static methods allowed
	static void helloWorld2() {
		System.out.println("Default implementation of method");
	}

}

