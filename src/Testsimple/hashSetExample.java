package Testsimple;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {

		HashSet<String> a = new HashSet<String>();
		System.out.println(a.isEmpty());
		a.add("INDIA");
		a.add("US");
		a.add("UK");
		a.add("AUS");
		a.add("AFRICA");

		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains("UAE"));
		a.remove("US");
		System.out.println(a);

//		for(String i:a) {
//			System.out.println(i);
//		}
		Iterator<String> i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
