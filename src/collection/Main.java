package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Map은 구현체이기 때문에 객체 생성할 수 없다. - > HashMap 구현체를 사용해 객체 생성
        //문자열 키와, 정수값으로 이뤄진 Map을 생성하고 -> put, get, remove 메소드 등을 사용해 맵에 데이터 추가/조회/삭제할 수 있다.

        Map<String, Integer> stScore = new HashMap<>();
        stScore.put("a", 40);
        stScore.put("b", 50);
        stScore.put("c", 60);

        stScore.replace("b", 80);
        System.out.println(stScore);
        stScore.remove("c");

        //Map에는 Iterator 사용할 수 없다
        /**
         for (Iterator st : stScore) {
         System.out.println(st);
         }
         */
        Set<Map.Entry<String, Integer>> entrySet = stScore.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + " , Value: " + entry.getValue());
        }

        System.out.println("-----70이상인 경우0------");
        Iterator<Map.Entry<String, Integer>> iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> entry2 = iterator1.next();
            if (entry2.getValue() > 70) {
                System.out.println(entry2);
            }
        }
        System.out.println("-----모든 점수에 10을 더함-----");
        Set<Map.Entry<String, Integer>> entrySet1 = stScore.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator2 = entrySet1.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Integer> entry = iterator2.next();
            entry.setValue(entry.getValue() + 10);
        }
        System.out.println("Updated Score: ");
        for (Map.Entry<String, Integer> entry : stScore.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
