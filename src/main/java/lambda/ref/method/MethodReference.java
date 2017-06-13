package lambda.ref.method;

public class MethodReference {

	public static void main(String[] args) {

		DoSmthInterface doSmth;
		doSmth = new DoSmthHelper()::doWork; // References to method
		doSmth = DoSmthHelper::doWorkStatic; // References to Static Method

		System.out.println(doSmth.doSmth("Hi ", 5));
	}

}

interface DoSmthInterface {
	
	public String doSmth(String s, int a);
}

class DoSmthHelper {

	public String doWork(String str, int i) {
		return str + i;
	}

	public static String doWorkStatic(String str, int i) {
		return str + i;
	}
}