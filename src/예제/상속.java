package 예제;

class P {
    P() {
        System.out.println("A");
    }

    P(int a) {
        System.out.println("B");
    }
}

class C extends P {
    C() {
        System.out.println("C");
    }

    C(int a) {
        System.out.println("D");
    }

    C(int a, int b) {
        super(a);
        System.out.println("E");
    }

}

public class 상속 {
    public static void main(String[] args) {
        P p1 = new C(); // AC
        System.out.println();
        P p2 = new C(1); //
        System.out.println();
        P p3 = new C(1, 2);
    }
}

