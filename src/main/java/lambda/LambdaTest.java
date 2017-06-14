package lambda;

public class LambdaTest {

	public static void main(String[] args) {

		// no lambda
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("no lambda");
			}
		}).start();

		// with lambda example #1
		Runnable runnable = () -> {
			System.out.println("Lambda #1");
		};

		runnable = () -> System.out.println("Lambda #1");

		new Thread(runnable).start();

		// with lambda example #2
		new Thread(() -> {
			System.out.println("Lambda #2");
		}).start();

		// with lambda example #3
		new Thread(() -> System.out.println("Lambda #3")).start();

	}

}
