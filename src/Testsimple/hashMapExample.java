package Testsimple;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hm =  new HashMap<Integer, String>();
		hm.put(0, "Sundar");
		hm.put(1, "Muthu");
		hm.put(2, "Jessie");
		System.out.println(hm);
		System.out.println(hm.get(1));
		
		Set a= hm.entrySet();
		
		System.out.println(a);
		
		Iterator it = a.iterator();
		
		while(it.hasNext()) {
//			System.out.println(it.next());
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());

		}
	}

}
