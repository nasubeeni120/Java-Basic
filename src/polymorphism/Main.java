package polymorphism;

public class Main {
	public static void main(String[] args) {

		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car,bicycle,boat}; // How to store different object using polymorphism
		car.go();
		bicycle.go();
		boat.go();
	
		System.out.println("=======");
		
		for(Vehicle x : racers) {
			x.go();
		}		
	}
}