package Testsimple;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 5;
		int factorial = 1;
		for (int i = 2; i <= number; i++) {
			factorial = factorial * i;

		}
		System.out.println("Factorial of a given number: " + factorial);

	}

}
