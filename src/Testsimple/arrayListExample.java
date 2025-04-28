package Testsimple;

import java.util.ArrayList;

public class arrayListExample {

//	int a = 1;
	public int a = 2;

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("Muthu");
		a.add("Sundar");
		System.out.println(a);
		a.add(0, "Jessi");
		System.out.println(a);
		System.out.println(a.get(1));
		
		if (a.contains("Sundar")) {
			System.out.println("It is present");
		} else {
			System.out.println("It's not present");
		}
		a.remove(2);
		System.out.println(a);
		System.out.println(a.size());

//       
//       
//  	 ArrayList<Integer> b = new ArrayList<>();
//  	 b.add(1);
//  	 b.add(5);
//  	 b.add(7);
//  	 for (int i:b) {
//  		 System.out.println(i);
//  	 }
	}

	public void getData() {
		System.out.println("Packages import");
	}

	private void getString() {
		System.out.println("access modifiers private");
	}

	void getDatas() {
		System.out.println("Packages import");
	}

	protected void getName() {
		System.out.println("Access modifierds protected");
	}

}
