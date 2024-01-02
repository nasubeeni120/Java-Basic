package variable;

public class Var4 {
    //멤버 , 인스턴스 변수
    int num1;

    static int num2;

    // 매개변수
    public void printName(String name) {
        //지역변수
        String prtMsg = name + " Hello";
        System.out.println(prtMsg);
    }

    public static void main(String[] args) {

        Var4 mc = new Var4();
        //인스턴스 변수 사용
        mc.num1 = 100;

        //클래스 변수 사용
        Var4.num2 = 50;

        mc.printName("일론 머스크");
        System.out.printf("%d, %d", mc.num1, Var4.num2);
    }
}
