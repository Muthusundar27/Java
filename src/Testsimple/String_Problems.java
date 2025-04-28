package Testsimple;

import java.util.Arrays;
import java.util.List;

public class String_Problems {

	public static void main(String[] args) {

		String s = "Welcome";
//		char cs[] = s.toCharArray();
//		for (char i : cs) {
//			System.out.println(i);
//		}
//	for (int i=0; i<cs.length; i++) {
//		System.out.println(cs[i]);
//	}

//	for (int i=0; i<s.length(); i++) {
//		System.out.println(s.charAt(i));
//	}
//	
		for (int j = s.length() - 1; j >= 0; j--) {
			System.out.print(s.charAt(j));

		}

//		int n = 2345;
//		int rev = 0, remainder = 0;
//		while (n != 0) {
//			remainder = n % 10;
//			rev = rev * 10 + remainder;
//			n = n / 10;
//		}
//		System.out.println(rev);

		String str = "Payment $100 paid";
		System.out.println(str.toUpperCase());

		String name = "muthu";
		String reverses = new StringBuffer(name).reverse().toString();
		String reverse = new StringBuilder(name).reverse().toString();
		System.out.println(reverse);
		System.out.println(reverses);
		
		

		int[] arr = {10, 20, 30, 40, 50};    
        int n = arr.length;
        for (int i = 1; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[n - 1];
            for (int j = n - 1; j > i; j--) {
            	arr[j] = arr[j - 1];
            }
            arr[i + 1] = temp;
        }
        System.out.println("Rearranged Array: " + Arrays.toString(arr));
	}

}
