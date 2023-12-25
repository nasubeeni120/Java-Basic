package forEachLoop;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println("====");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
