package superKeyword;

public class Person {
	
	String name;
	int age;
	
	Person(String name, int age) { //Constructor. I will set the parameters up later
		this.name = name;
		this.age = age;
	}
	void sayHello() {
		System.out.println("Hello from Person");
	}
}