package staticKeyword;

public class Example {

    public static int staticField = 100;

    public static void staticMethod() {
        System.out.println("This is a static method.");
        System.out.println("Static var = " + staticField);
    }

    public static void main(String[] args) {
        staticMethod();
    }
}
