package superKeyword;

public class Main {
	// super = keyword refers to  the superclass(parent) of an object very similar to the "this" keyword.
	public static void main(String[] args) {
		Hero hero1 = new Hero("Batman", 42, "$$$");
		Person hero2 = new Person("Ironman", 50);
		
		hero1.sayHello();
		
		for(int i=0; i< hero1.name.length(); i++) {			
			hero2.sayHello();
			}
		System.out.println("====================");
		switch(hero1.name) {
		case "Batman":
			System.out.println("It's hero1");
			break;
		case  "Ironman":
			System.out.println("It's hero2");
			break;				
		default:
			System.out.println("It's test for switch case.");
		}
		System.out.println("====================");
		System.out.println(hero1.name + ", " + hero1.age + ", " + hero1.power);
			}
}
