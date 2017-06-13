package lambda.ref.constructor;

public class ConstructorReference {

	public static void main(String[] args) {

		CatFactory factory = Cat::new; // Reference to Constructor
		Cat cat = factory.create("Barsik");
		System.out.println(cat);
	}
}

@FunctionalInterface
interface CatFactory {

	Cat create(String name);
}

class Cat {

	private String name;
	private int age;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Cat(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat: name - " + name + ", age - " + age;
	}

}