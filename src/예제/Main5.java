package 예제;

public class Main5 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 3;
        int d = 5;

        boolean a1 = (a == 2 | a == c); // 1
        System.out.println(a1);

        boolean a2 = !(c > d);//1
        System.out.println(a2);

        boolean a3 = 1 == b ^ c != d; // 1
        System.out.println(a3);
    }
}
