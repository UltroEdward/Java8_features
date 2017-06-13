package interfaces.functional.buildin;

import java.util.function.Supplier;

/**
 * Test Supplier interface. Return desired object
 * 
 */
public class SupplierTest {

	public static void main(String[] args) {

		Supplier<Object> supplier1 = Object::new;
		Supplier<Integer> supplier2 = () -> new Integer(Runtime.getRuntime().availableProcessors());

		System.out.println(supplier1.get());
		System.out.println(supplier2.get());
	}
}
