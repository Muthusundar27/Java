package Testsimple;

public class NestedLoops {

	public static void main(String[] args) {
//		for(int i=1; i<=4; i++) {
//			System.out.println(i);
//			for (int j=1; j<=4; j++) {
//				System.out.println(j);
//			}
//		}
		
		// Assignement
//		give output
//		1 2 3 4
//		5 6 7
//		8 9
//		10
//		int k =1;
//		for(int i=0; i<4; i++) {
//			
//			for (int j=1; j<=4-i; j++) {
//				System.out.print(k);
//				System.out.print("\t");
//				k++;
//			}
//			System.out.println("");
//		}
	
	// Assignement2
//	give output
//	1
//	2 3 
//	4 5 6 
//	7 8 9 10
//    int k=1;
//    for (int i=0; i<4; i++) {
//    	for (int j=0; j<=i; j++) {
//    		System.out.print(k);
//    		System.out.print("\t");
//    		k++;
//    	}
//    	System.out.println();
//    }
	
	// Assignement3
//		give output
//		1
//		1 2
//		1 2 3 
//		1 2 3 4
	
//		for (int i =1; i<=4; i++) {
//			for (int j=1; j<=i; j++) {
//				System.out.print(j);
//				System.out.print("\t");
//			}
//			System.out.println("");
//		}
		//Assignement4
//		give output
//		3
//		6 9
//		12 15 18 
		
//		int k =1;
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(k*3);
//				System.out.print("\t");
//				k++;
//			}
//			System.out.println("");
//		}
		
	
//		give output
//		4 8 12 16
//		20 24 28
//		32 36
//		40
		
//      int k =1;
//      for (int i=0; i<4; i++) {
//    	  for (int j=4; j>i; j--) {
//    		  System.out.print(k*4);
//    		  System.out.print("\t");
//    		  k++;
//    	  }
//    	  System.out.println("");
//      }
		
		
//      * 
//    * * * 
//  * * * * * 
//* * * * * * * 

		int num = 4;
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-i-1; j++) {
				System.out.print("  ");
			}
			for(int k=0; k<=2*i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
		
		
		
	}
}

