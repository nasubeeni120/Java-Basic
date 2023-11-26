package methods;

public class Main {

	public static void main(String[] args) {
		//method = a block of code that is executed whenever it is called
		String name = "Bro";
		
		for(int i=1; i<name.length();i++) {
			hello(name);
		}		
	}
	static void hello(String name) {
		System.out.println("Hello " + name);
	}
}