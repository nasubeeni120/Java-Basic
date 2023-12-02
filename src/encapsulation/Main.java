package encapsulation;

public class Main {
	public static void main(String[] args) {
		Car car1 = new Car("Chevrolet", "Camero",2010);	
		Car car2 = new Car("Ford", "Mustang", 2022);
		
		System.out.println(car2.getMake());
		car2.copy(car1);
		System.out.println(car2.getMake());
	}
}
