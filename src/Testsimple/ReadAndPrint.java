package Testsimple;

import java.util.Scanner;

public class ReadAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);				
		int num;		
		System.out.println("Enter the num: ");
		 
		num = obj.nextInt();
	
		System.out.println("Entered num is: " + num );
		
		String name="";
		
		System.out.println("Enter the name: ");
		
		name = obj.next();
		
		System.out.println("Entered name is: " + name );
	}

}
