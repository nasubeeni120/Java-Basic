package 예제;

class Parent {
    public Parent() {
        System.out.println("A");
    }

    public void fn() {
        System.out.println("B");
    }

    public void fnA() {
        System.out.println("C");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("A2");
    }

    public void fn() {
        System.out.println("B2");
    }

    public void fnB() {
        System.out.println("C2");
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();

        c.fn();
        c.fnA();


    }
}
