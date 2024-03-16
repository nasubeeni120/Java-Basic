package generic;

public class Main {
    public static void main(String[] args) {

        Pair<String, Integer> strings = new Pair<>("Hello", 10);
        Pair<Integer, Integer> integers = new Pair<>(42, 500);

        System.out.println(strings);
        System.out.println(integers);

        Pair<Person, Person> people = new Pair<>(new Person("Richard"), new Person("Casey"));
        System.out.println(people);

        Pair<String, Integer> stringIntegerPair = new Pair<>("Hello", 42);

        String first = stringIntegerPair.getFirst();
        Integer second = stringIntegerPair.getSecond();

    }
}