package interfaces.functional.buildin;

import java.util.function.Function;

/**
 * Test Function interface. Function<String, Integer>, where String - input
 * param type, Integer - output.
 * 
 */
public class FunctionTest {
	public static void main(String[] args) {

		Function<String, Integer> getLength = String::length;
		Function<String, String> toUpperCase = (s) -> s.toUpperCase();

		System.out.println(getLength.apply("Hello"));
		System.out.println(toUpperCase.apply("Hello"));
	}
}
