package Testsimple;

public class Palindrome {

	public static void main(String[] args) {
		String p = "madam";
		
		String revString = "";
//		for (int i=p.length()-1; i>=0; i--) {
//			revString = revString+p.charAt(i);
//		}
//		System.out.println(revString);
//		
//		char rec[] = p.toCharArray();
		for (int i = p.length() - 1; i >= 0; i--) {
			revString = revString + p.charAt(i);
		}
		System.out.println("The reverse String: " + revString);
		if (p.equals(revString)) {
			System.out.println("The given string is Palindrome: " + p);
		} else {
			System.out.println("The given string is not Palindrome: " + p);
		}
		
		
//		 Reverse the number and check for Palindrome
		int number = 46641;
		int originalNumber = number;
		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("The reverse number: " + rev);
		if (originalNumber == rev) {
			System.out.println("The given integer is Palindrome ");
		} else {
			System.out.println("The given integer is not Palindrome ");
		}




		
		
		
//		
//		 String str = "mam";
//		 String originalString = "mam";
//		 String rev="";
//		 char[] ch = str.toCharArray() ;
//		 for (int i=ch.length-1; i>=0; i--) {
//			 rev+=ch[i];
//		 }
//	System.out.println(rev);
//		 
//	if(originalString.equals(rev)) {
//		System.out.println("The Given string is palindrone");
//	}
//	else {
//		System.out.println("The Given string is not palindrone");
//	}
	}

}
