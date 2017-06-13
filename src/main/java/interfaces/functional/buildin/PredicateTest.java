package interfaces.functional.buildin;

import java.util.function.Predicate;

/**
 * Test Predicate interface. Return true or false
 * 
 */
public class PredicateTest {

	public static void main(String[] args) {
		Predicate<String> predicate1 = (s) -> s.length() > 0;
		Predicate<String> predicate2 = (s) -> !s.startsWith("ERROR");
		 
		System.out.println(predicate1.test("HI"));
		System.out.println(predicate1.test(""));
		
		System.out.println(predicate2.test("HI"));
		System.out.println(predicate2.test("ERROR"));
		
		System.out.println(predicate1.and(predicate2).test("HI"));
		System.out.println(predicate1.and(predicate2).test("ERROR_HI"));
		 

	}

}
