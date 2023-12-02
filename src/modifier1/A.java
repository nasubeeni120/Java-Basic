package modifier1;

public class A {
	String name ;
	int age;
	static int autoInt;
	int firstint = 1;
	public A (String name, int age, int autoInt){
		this.name = name;
		this.age = age;	
		this.autoInt = ++ firstint;
	}
	public void getDetails() {
		System.out.println(this.name +" " +  this.age + " " + this.firstint);
	}
	public void ThisPublic() {
		System.out.println("It's public");
	}
	protected void ThisProtected() {	
		System.out.println("It's Protected");
	}
}