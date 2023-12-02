package polymorphism2;

//Subclass of Animal Class
//get all the fields and methods from parent class.
public class Dog  extends Animal {
	private int breed;
	
	public int getBreed() {
		return breed;
	}
	public void setBreed(int breed) {
		this.breed = breed;
	}
	public void eatFromDog() {
		System.out.println("Dog Class");
	}
	
}
