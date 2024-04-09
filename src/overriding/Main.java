package overriding;

public class Main {
public static void main(String[] args) {

	Animal animal = new Animal(); //Animal 클래스 객체 생성
	Dog dog = new Dog(); // Dog 클래스 객체 생성
	dog.dogSpeak(); // dogSpeak 메소드 호출
	}
}
