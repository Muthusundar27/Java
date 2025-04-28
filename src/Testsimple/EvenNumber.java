package Testsimple;

public class EvenNumber {

	public static void main(String[] args) {
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum1 = sum1 + i;
//			System.out.println("The sum of even number from 1 to 100: " + i);

			}
		}
		System.out.println("The sum of even number from 1 to 100: " + sum1);

	}

}
