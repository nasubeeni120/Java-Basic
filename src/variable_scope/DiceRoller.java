package variable_scope;

import java.util.Random;

public class DiceRoller {
	//Global variables -> declared outside a method, but within a class visible to all parts of a class
	Random random; 
	int number;
	
	DiceRoller(){
		random = new Random();
		roll();
	}
	void roll() {
		 
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
}
