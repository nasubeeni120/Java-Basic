package variable_scope;

public class Test {

	public void pupAge() {
		// age = local variable. This is defined inside pupAge() method and its scope is limited to only this method.
		int age = 0;
		age = age + 7;
		System.out.println("Puppy age is: " + age);
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.pupAge();
	}
}
