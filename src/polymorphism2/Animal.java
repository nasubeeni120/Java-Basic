package polymorphism2;

public class Animal {
	public String name;
	private String color;

	public void eat() {
		System.out.println("munch");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}