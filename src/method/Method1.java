package method;

public class Method1 {

    public static void main(String[] args) {
        int add = sum(10, 20);
        System.out.println(add);
    }

    public static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }
}
