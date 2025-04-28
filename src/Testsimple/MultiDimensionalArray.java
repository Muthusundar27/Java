package Testsimple;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int ar[][] = new int[2][3];
//		ar[0][0] = 2;
//		ar[0][1] = 4;
//		ar[0][2] = 6;
//		ar[1][0] = 8;
//		ar[1][1] = 12;
//		ar[1][2] = 10;
//		
//		for (int i[] : ar) {
//			for (int j : i) {
//				System.out.println(j);
//			}
//		}
	
//		System.out.println(ar[1][1]);

//		System.out.println(b[2][1]);
		
//		int max = b[0][0];
//		int value=0;
//		for (int i = 0; i < 3; i++) {
//		
//			for (int j = 0; j < 3; j++) {
//				
//				if (b[i][j]>max) {
//					max = b[i][j];
//				}
//			}
//		}
//		System.out.println(max);  
		
//		int max =0;
//		
//		for (int i=0; i<3; i++) {
//			for (int j=0; j<3; j++) {
//				int value = b[i][j];
//				if(value>max) {
//					max = value;
//				}
//				 
//			} 
//		}
//		System.out.println("The maximum value is :" + max); 
//		
//		System.out.println("***************");
		
//		int min=Integer.MAX_VALUE; 
//		
//		for (int i=0; i<3; i++) {
//			for (int j=0; j<3; j++) {
//				int value1 = b[i][j];
//				if(value1<min) {
//					min = value1;
//				}
//			}
//				
//		}System.out.println("The minimum value is :" + min); 
		
//		int b[][] = { { 2, 2, 5 }, { 3, 0, 7 }, { 1, 4, 9 } };
//          int min= b[0][0]; 
//          int minColumn =0;
//          		
//		for (int i=0; i<3; i++) {
//			for (int j=0; j<3; j++) {
//				if(b[i][j]<min) {
//					min = b[i][j];
//					minColumn = j;
//				}
//			}
//				
//		}System.out.println("The minimum value is :" + min); 
//		int max = b[0][minColumn];
//		for (int i=0; i<3; i++) {
//			if(b[i][minColumn] > max) {
//				max = b[i][minColumn];
//			}
//		}
//		System.out.println(max);
		
//		int k=0;
//		int maximumValue = b[0][minColumn];
//		
//		while(k<3) {
//			if(b[k][minColumn]>maximumValue) {
//				maximumValue = b[k][minColumn];
//			}
//			k++;
//		}
//		
//		System.out.println("The maximum Value of column is : " + maximumValue); 
//		
		int b[][] = { { 12, 5, 4 }, { 3, 6, 12 }, { 8, 1, 7 } };
//		
//		int maxi=b[0][0];
//		for (int i=0; i<3; i++) {
//			for (int j=0; j<3; j++) {
//				if(b[i][j]>maxi) {
//					maxi=b[i][j];
//				}
//			}
//		}System.out.println("The maximum value is : " + maxi); 
		
		
		
        int max= b[0][0]; 
        int maxColumn =0;
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if(b[i][j]>max) {
					max = b[i][j];
					maxColumn = j;
				}
			}
				
		}System.out.println("The maximum value is :" + max);
		System.out.println("The maximum column is :" + maxColumn);
		
//		
		int k=0;
		int minimumValue = b[0][maxColumn];
		
		while(k<3) {
			if(b[k][maxColumn]<minimumValue) {
				minimumValue = b[k][maxColumn];
			}
			k++;
		}
		
		System.out.println("The minimum Value of column is : " + minimumValue); 
		
	}

}
