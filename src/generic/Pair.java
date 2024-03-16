package generic;

/*
두 개의 아이템을 함께 묶어 저장하는 Generic클래스
T: Type으로, 임의의 타입을 나타냄, T는 Pair의 인스턴스가 생성될 때 저장됨
 */
public class Pair<T, S> {

    private final T first;
    private final S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
