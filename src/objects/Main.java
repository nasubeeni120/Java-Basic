package objects;

public class Main {
	public static void main(String[] args) {
		
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		myCar1.drive();
		myCar2.brake();
		System.out.println(myCar1.make);
		System.out.println(myCar1.model);
		System.out.println(myCar1.model+" is "+myCar1.color);		
		
		System.out.println(myCar2.make);
		System.out.println(myCar2.model);		
		
		System.out.println(myCar1.Name);
		myCar1.want();
	}
}