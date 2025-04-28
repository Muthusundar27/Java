package Testsimple;

public class parentDemo {

	String name = "Muthu";

	public parentDemo() {
		System.out.println("I am a parent class constructor.");
	}

	public void getData() {
		System.out.println("I am a parent class method.");
	}

	public static void main(String[] args) {

		parentDemo obj = new parentDemo();
		obj.getData();
	}

}
