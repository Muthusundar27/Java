package Testsimple;

import java.util.HashMap;
import java.util.Map;

public class countOccuranceOfLetters {

	public static void main(String[] args) {
		
//		String occ = "Roseline";
//		char a[] = occ.toCharArray();
//		Map<Character, Integer> count = new HashMap<>();
//		for (char element : a) {
//			if (count.containsKey(element)) {
//				count.put(element, count.get(element) + 1);
//			} else {
//				count.put(element, 1);
//			}
//		}
//		for (Map.Entry<Character, Integer> entry : count.entrySet()) {
//			System.out.println("The letter " + entry.getKey() + " occurs " + entry.getValue() + " times");
//		}

	
	
	int array[] = { 10, 20, 25, 20, 10, 15 };
	Map<Integer, Integer> count1 = new HashMap<>();
	for (int element1 : array) {
		if (count1.containsKey(element1)) {
			count1.put(element1, count1.get(element1) + 1);
		} else {
			count1.put(element1, 1);
		}
	}

	for (Map.Entry<Integer, Integer> entry1 : count1.entrySet()) {
		System.out.println("The Integer " + entry1.getKey() + " occurs " + entry1.getValue() + " times");
	}
//
//	 String sentence = "This is a sample sentence to count words"; 
//	 if (sentence == null || sentence.isEmpty()) {
//         System.out.println("0"); // If the sentence is empty or null, return 0
//     }
//     String[] words = sentence.split("\\s+"); // Split the sentence into words using whitespace as delimiter
//     System.out.println(words.length);// Return the number of words
 
	}
}
