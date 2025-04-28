package Testsimple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class duplicateArray {

	public static void main(String[] args) {
		String str1[] = { "Roseline", "Maria", "Maria", "Praveen" };
		String str2[] = { "Roseline", "Maria", "Praveen", "Praveen" };

		List<String> list = new ArrayList<>(Arrays.asList(str1));
		list.addAll(Arrays.asList(str2));
		String[] lista = list.toArray(new String[0]);
		Set<String> set = new HashSet<>(Arrays.asList(lista));
		String[] seta = set.toArray(new String[0]);
		System.out.println(Arrays.toString(seta));

		// 13 Remove duplicate integer in an array
//		int array1[] = { 10, 20, 25, 20, 10, 15 };
//		List<Integer> list2 = new ArrayList<>();
//		for (int i : array1) {
//			if (!list2.contains(i)) {
//				list2.add(i);
//			}
//			
//		}
//		System.out.println(list2);
		
		// 13 Remove first duplicate integer in an array
//		int array1[] = { 10, 20, 25, 20, 10, 15 };
//		List<Integer> lst= new ArrayList<>();
//		for (int i : array1) {
//			if(lst.contains(i)) {
//				System.out.println("The first duplicate integer is :" + i);
//				break;
//			}
//			else {
//				lst.add(i);
//			}
//		}
		
		
		// 15. Search an element in an array
//				int array3[] = { 15, 20, 15, 20, 10, 35 };
//				int search = 25;
//				boolean flag = false;
//				for (int i : array3) {
//					if (search == i) {
//						System.out.println("Search element found " + i);
//						flag = true;
//						break;
//					}
//				}
//				if (flag == false) {
//					System.out.println("The search element is not found");
//				}
//				
			
//			String str1[] = { "Roseline", "Maria", "Maria", "Praveen" };
//		String str2[] = { "Roseline", "Maria", "Praveen", "Praveen" };

//		List<String> list = new ArrayList<>(Arrays.asList(str1));
//		list.addAll(Arrays.asList(str2));
////				
//				HashSet<String> hs = new HashSet<>(list);
//				System.out.println(hs);
				
//				int arrays[] = { 15, 20, 15, 20, 10, 35 };
//				   Set<Integer> set = new HashSet<>();
//				for (int i : arrays) {
//					set.add(i);
//				}
//System.out.println(set);
		
		

	}
		
}
