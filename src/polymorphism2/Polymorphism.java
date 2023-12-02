package polymorphism2;

public class Polymorphism {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat(); // munch

		Dog myDog = new Dog();
		myDog.eat(); // munch
		myDog.eatFromDog(); // Dog Class

		Cat myCat = new Cat();
		myCat.eat(); // munch
		myCat.eat(); // nom nom
	}
}
