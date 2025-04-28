package Testsimple;

public class arrayPractise {
//	int [] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};

	public static void main(String[] args) {

		arrayListExample ap = new arrayListExample();
		ap.getData();
		ap.getName();
		ap.getDatas();

		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
//		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int[] myArray = { 84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0 };
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	
	}
}
