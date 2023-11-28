package superKeyword;

public class Hero extends Person {
	String power;
	public Hero(String name, int age, String power){
		super(name, age);		
		this.power = power;	
	}
	void sayHello() {
		System.out.println("Hello from Hero");
	}
}