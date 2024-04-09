package overriding;

public class Animal {
	//하위클래스인 Dog 클래스 객체인 dog를 호출, Dog 클래스엔 dogSpeak 메소드가 없으므로, 부모 클래스의 dogSpeak()가 호출
	void dogSpeak() {
		System.out.println("The !Dog! goes bark");
	}
}
