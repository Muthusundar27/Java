package Testsimple;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// 28. Write a JAVA program to check string is Anagram or not
		String a1 = "basre";
		String b1 = "beaer";

		String sstr1 = a1.toLowerCase();
		String sstr2 = b1.toLowerCase();
		if (!(sstr1.length() == sstr2.length())) {
			System.out.println("The string is not Anagram");
		} else {
			char[] charArray1 = sstr1.toCharArray();
			char[] charArray2 = sstr2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			if (Arrays.equals(charArray1, charArray2)) {
				System.out.println("The string is Anagram");
			} else {
				System.out.println("The string is not Anagram");
			}
		}

	}

}


