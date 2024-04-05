package 진법;

public class m1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 3;
        int d = 5;
        boolean f1 = ((a == 2) | (a == c));
        System.out.println(f1);

        boolean f2 = c > d;
        System.out.println(f2);

        boolean f22 = !(c > d);
        System.out.println(f22);

        boolean f3 = (1 == b ^ c != d);
        System.out.println(f3);
    }
}
