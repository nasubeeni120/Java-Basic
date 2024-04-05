package 예제;


class A {
    int x = 100;

    A() {
        this(500);
    }

    A(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }
}

//B 클래스에선 getX를 오버라이딩 하지 않았다
class B extends A {
    int x = 4000;

    B() {
        this(5000);
    }

    B(int x) {
        this.x = x;
    }
//    int getX() {
//        return x;
//    }
}

public class M2 {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.getX());
    }
}
