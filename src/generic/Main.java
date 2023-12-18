package generic;

import java.util.ArrayList;

/**
 * Generic
 */

class LandAnimal {
    public void crying() {
        System.out.println("육지동물");
    }
}

class Cat extends LandAnimal {
    public void crying() {
        System.out.println("고양이");
    }
}

class Dog extends LandAnimal {
    public void crying() {
        System.out.println("멍멍");
    }
}

class Sparrow {
    public void crying() {
        System.out.println("짹쨱");
    }
}

class AnimalList<T> {
    ArrayList<T> al = new ArrayList<>();

    void add(T animal) {
        al.add(animal);
    }

    T get(int index) {
        return al.get(index);
    }

    boolean remove(T animal) {
        return al.remove(animal);
    }

    int size() {
        return al.size();
    }
}

public class Main {
    public static void main(String[] args) {
        AnimalList<LandAnimal> landAnimal = new AnimalList<>();
        landAnimal.add(new LandAnimal());
        landAnimal.add(new Cat());
        landAnimal.add(new Dog());
        //landAnimal.add(new Sparrow()); 오류가 발생함 -> AnimalList를 상속받는 자식이 아니므로

        for (int i = 0; i < landAnimal.size(); i++) {
            landAnimal.get(i).crying();
        }
    }
}
