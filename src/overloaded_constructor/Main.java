package overloaded_constructor;

public class Main {
	public static void main(String[] args) {
	
//		Pizza pizza = new Pizza(); // Instance of Pizze class -> Create pizza
//		System.out.println("Here are the ingredients of your pizza: ");
//		System.out.println(pizza.bread);
//		System.out.println(pizza.sauce);
//		System.out.println(pizza.cheese);
//		System.out.println(pizza.topping);
		
		//getters & setters
		Pizza2 pizza2 = new Pizza2();
		System.out.println(pizza2.getBread());
	}
}