package problems;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// write a program to find the difference between the given number and its reverse number
		
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		int num = obj.nextInt();
//		int originalNumber =num;
//		
//	    System.out.println("Print the given num: " + num);
//		int rev = 0, remainder;
//		while (num!=0) {
//			remainder = num%10;
//			rev = rev*10 + remainder;
//			num = num /10;
//		}
//
//       System.out.println("Print the rev num: " + rev);
//       
//       int result = originalNumber -rev;
//       System.out.println(result);
	
	
//	Write a Java program to reverse a given string without using any built-in functions or libraries.

	        String originalString = "Hello, World!";
	        String reversedString = reverseString(originalString);
	        System.out.println("Original String: " + originalString);
	        System.out.println("Reversed String: " + reversedString);
	    }

		public static String reverseString(String str) {
			// Convert the string to a character array
			char[] charArray = str.toCharArray();
			int start = 0;
			int end = charArray.length - 1;

			// Reverse the character array
			while (start < end) {
				// Swap characters at start and end
				char temp = charArray[start];
				charArray[start] = charArray[end];
				charArray[end] = temp;

				// Move the pointers
				start++;
				end--;
			}

			// Convert the character array back to a string
			return new String(charArray);
		}
}
