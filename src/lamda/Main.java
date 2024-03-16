package lamda;

public class Main {
    public static void main(String[] args) {

        String name = "Bro";
        char symbol = '!';

        MyInterface myInterface = (x, y) -> {
            System.out.println("Hello World");
            System.out.println("It's a nice day. " + x + y);
        };

        MyInterface myInterface2 = (x, y) -> {
            System.out.println("Hello" + x + y);
        };

        myInterface.message(name, symbol);
    }
}
