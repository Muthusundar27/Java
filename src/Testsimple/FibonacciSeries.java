	package Testsimple;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 0;
		int number2 = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.println("The Fibonaccci series " + number1);
			int sum = number1 + number2;
			number1 = number2;
			number2 = sum;
		}

	}

}
