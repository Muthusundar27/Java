package Testsimple;

public final class finalDemo {

	final void getData() {
		System.out.println("Test final method.");
	}

	// class name as final ...that means you cannot extend that class

	public static void main(String[] args) {

		final int i = 2;
		System.out.println(i);
//		 i = 3;
//		 System.out.println(i);
		finalDemo obj = new finalDemo();
		obj.getData();

	}

}
