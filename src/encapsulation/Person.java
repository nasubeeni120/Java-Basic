package encapsulation;

class Person {
	static String stt = " // 이건 static!";
	private int age;
	
	public int getAge() { //read-only
		return age;
	}
	public void setAge() { //write-only
		this.age = age;
	}
	
	Person(int age){
		System.out.println(age + this.stt);
	}
	void afterTenyears(int age) {
		age += 10;
		System.out.println("After 10 years : " + age + this.stt);
	}
}