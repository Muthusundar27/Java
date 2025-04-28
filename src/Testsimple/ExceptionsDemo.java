package Testsimple;

public class ExceptionsDemo {

	public void getData() {
		try {
			int a = 7;
			int b = 0;

			int k = a / b;
			System.out.println(k);
			
//			int[] arr = new int[5];
//			System.out.println(arr[7]);
			
//		}  catch (IndexOutOfBoundsException ey) {
//			System.out.println("I catched the IndexOutOfBounds/exceptions");
//		}
//		catch (ArithmeticException et) {
//			System.out.println("I catched the Arithmetic/exceptions");
		}
		// generic exception:
		catch (Exception e) {
			System.out.println("I catched the error/exceptions");
		}
		finally {
			System.out.println("Delete Cookies");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionsDemo ed = new ExceptionsDemo();
		ed.getData();

	}

}
