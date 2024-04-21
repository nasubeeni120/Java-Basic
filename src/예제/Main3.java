package 예제;

public class Main3 {
    static void change(char arr[]) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 'b') arr[i] = 'c'; // 원소가 'b'면 'c'로 교체
            else if (i == arr.length - 1) arr[i] = arr[i - 1]; // 길이-1 회차에 i-1째 원소와 교체
            else arr[i] = arr[i + 1]; //아니면 arr[i]  에 i+1번째 원소 대입
        }
    }

    static void prtarr(char arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c', 'b', 'c', 'd', 'a'};
        change(a);
        prtarr(a);

    }
}
