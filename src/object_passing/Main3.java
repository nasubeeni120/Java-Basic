package object_passing;

public class Main3 {
	public static void main(String[] args) {
	
		Dog aDog = new Dog("Max");
		Dog oldDog = aDog;
		
		foo(aDog);
		

	}
	
	public static void foo(Dog d) {
		d.getName().equals("Max"); // true
		d = new Dog("Fifi");
		d.getName().equals("Fifi");	//true
	}
}
