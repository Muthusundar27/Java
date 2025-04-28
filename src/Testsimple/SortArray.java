package Testsimple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortArray {

	public static void main(String[] args) {

		// 20 sort an array

//				int sort[] = { 5, 2, 8, 3, 1 };
//				for (int i = 0; i < sort.length - 1; i++) {
//					for (int j = 0; j < sort.length - i - 1; j++) {
//						if (sort[j] > sort[j + 1]) {
//							int temp = sort[j];
//							sort[j] = sort[j + 1];
//							sort[j + 1] = temp;
//						}
//					}
//
//				}
//				System.out.println("The sorted array " + Arrays.toString(sort));
//				
//				String s5 = "Hello World";
//				int count5 = 0;
//				char[] vowel = s5.toCharArray();
//				for (char c : vowel) {
//					if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//						count5++;
//					}
//				}
//				System.out.println("The number of vowels in a String " + count5);


				// 21 Remove duplicate in an array

//				int dup[] = { 5, 2, 8, 3, 1, 5, 6 };
//				Set<Integer> t = new TreeSet<>();
//				for (int i : dup) {
//					t.add(i);
//
//				}
//				System.out.println("After removing duplicate " + t);
//
//	
//	String cop [] = {"Muthu", "Sundar", "Virat", "Sundar", "Muthu"};
//	Set<String> obj = new HashSet<>();
//	for (String i : cop) {
//		obj.add(i);
//	}
//	System.out.println("After removing duplicate " + obj);
		
	//merge
//		int[] arr1 = {1, 3, 5};
//		 int[] arr2 = {2, 4, 6};
//		 List<Integer> ls = new ArrayList<>();
//		 for (int i : arr1) {
//			 ls.add(i);
//		 }
//		 for(int j: arr2) {
//			 ls.add(j);
//		 }System.out.println(ls);
		
//		Write a Java program to reverse a sentence but keep words in the same order.
		 String sentence = "Automation testing is fun";
	        String[] words = sentence.split(" ");

	        for (int i = 0; i < words.length; i++) {
	            words[i] = new StringBuilder(words[i]).reverse().toString();
	        }

	        System.out.println(String.join(" ", words));
}
}
