package constructor;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Rick", 64, 60.0);
        Human human2 = new Human("Su been", 25, 49.0);
        System.out.println(human.name);

        Human human3 = new Human(human2.getName(), human2.getAge(), human.getWeight());
        System.out.println("This is human2's name: " + human3.name);
        System.out.println("This is human1's weight: " + human.weight);
        System.out.println("This is human2's name: " + human2.name + ", and human's age: " + human.age);

        //Test1 => Can call different constructors in sysout at the same time.
        System.out.println(human2.name + " " + human.weight);
        human2.eat();
        human.drink();
        human.drive();
    }
}