package generic;

import java.util.StringJoiner;

public class Numbers {
    private final Integer number;

    public Numbers(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Numbers.class.getSimpleName() + "[", "]")
                .add("number=" + number)
                .toString();
    }
}
