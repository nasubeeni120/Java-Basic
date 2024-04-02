package 예제;

public class ovr {
    public static void main(String[] args) {

        ovr a1 = new ovr();
        ovr a2 = new ovr2();
        System.out.println(a1.sun(3, 2) + a2.sun(3, 2));
    }
    int sun(int x, int y) {
        return x + y;
    }
}

class ovr2 extends ovr {
    int sun(int x, int y) {
        return x - y + super.sun(x, y);
    }
}