package 예제;

class N {
    private int a;

    public N(int a) {
        this.a = a;
    }

    public void display() {
        System.out.println("a=" + a);
        this.a = 1000;
    }
}

class M extends N {
    public M(int a) {
        super(a);
        super.display();
        super.display();
    }
}

public class Main4 {
    public static void main(String[] args) {
        M obj = new M(10); // 생성자 호출


    }
}
