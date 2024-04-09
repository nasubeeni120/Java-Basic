package exception;

public class Main1 {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4};

        try {
            for (int i = 0; i <= 4; i++)
                System.out.println(a[i]);
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.println("A");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
    }
}