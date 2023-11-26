package overloaded_constructor;

public class Pizza {
	
	//Some of the value we receive
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	//Pizza Constructor
	Pizza(String bread, String sauce, String cheese, String topping){ // 4 Parameters
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
	Pizza(String bread, String sauce, String cheese){ // 3 Parameters
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	Pizza(String bread, String sauce){ // 2 Parameters
		this.bread = bread;
		this.sauce = sauce;
	}
	Pizza(String bread){ // 1 Parameters
		this.bread = bread;
	}
	Pizza(){ //no-argument constructor.
		this.bread = "Regular";
		this.sauce = "Tomato";
		this.cheese = "Cheese";
		this.topping = "Topping";
	}
}