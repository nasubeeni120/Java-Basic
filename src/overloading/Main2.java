package overloading;

public class Main2 {
	public static void main(String[] args) {
		
		int myNum = plusMethod(5,10);
		double myNum2 = plusMethod(5.0,4.0);
		
		System.out.println(myNum + " " + myNum2);
		}
	static int plusMethod(int x, int y) {
		return x + y;
	}
	static double plusMethod(double x, double y) {
		return x + y;
	}
}