package Testsimple;

import java.util.ArrayList;

public class problem01 {

	public static void main(String[] args) {
		int a[] ={4,5,5,5,4,6,6,9,4}; 
		// Print unique number from the list- Amazon  
		//print the string in reverse 
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i=0; i<a.length; i++) {
			int k =0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for(int j=1+i; j<a.length; j++) {
					if(a[i]==a[j]) {
						k++;
					}
				}
				System.out.println("Num is " + a[i] + " And count is " + k);
			if(k==1) {
				System.out.println("The Unique num is " + a[i] + " And count is " + k);
			}
			}		
		}
	}

}
