package generic;

import java.util.StringJoiner;
/*
사람의 이름을 저장, Pair과 함께 사용
 */
public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
