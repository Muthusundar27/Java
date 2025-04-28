package Testsimple;

public class Swap {

	public static void main(String[] args) {

		// 18. swap 2 numbers
				int x = 100;
				int y = 200;
				x = x + y;
				y = x - y;
				x = x - y;
				System.out.println("After Swapping Integer");
				System.out.println("The value of x " + x);
				System.out.println("The value of y " + y);
				
				// 19. swap 2 Strings

//				String str1 = "Roseline";
//				String str2 = "Maria";
//				
//				String str3 = str2;
//				str2 = str1;
//				str1= str3;
//				System.out.println(str1);
//				System.out.println(str2);
				

				String str3 = "Muthu";
				String str4 = "Sundar";
				str3 = str3 + str4;
				str4 = str3.substring(0, str3.length() - str4.length());
				str3 = str3.substring(str4.length());
				System.out.println("After Swapping Strings");
				System.out.println("The value of str3 " + str3);
				System.out.println("The value of str4 " + str4);				


	}

}
