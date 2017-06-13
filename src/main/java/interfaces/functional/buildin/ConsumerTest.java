package interfaces.functional.buildin;

import java.util.function.Consumer;

/**
 * Test Consumer interface. Make some action with some object
 * 
 */
public class ConsumerTest {

	public static void main(String[] args) {
		
		Consumer<String> greeter = (name) -> System.out.println("Hello, " + name);
		greeter.accept("Vova");
	}
}
