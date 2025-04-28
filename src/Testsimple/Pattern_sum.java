package Testsimple;

public class Pattern_sum {

	public static void main(String[] args) {

		int num = 4;
//		for (int i = 0; i <= num; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		for (int i=0; i<=num; i++) {
//			for(int j=0; j<=num-i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}	
//
		int num1 = 3;
		for (int i = 0; i <= num1; i++) {
			for (int j = 0; j < num1 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		int num = 4;
//		for(int i=0; i<num; i++) {
//			for(int j=0; j<num-i-1; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<=i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

		
	}

}
