package Testsimple;

public class childDemo extends parentDemo {

	String name = "Learning";

	public childDemo() {
		super(); // this should be always in first line
		System.out.println("I am a child class constructor.");

	}

	public void getString() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData() {
		super.getData();
		System.out.println("I am a child class method.");
	}

	public static void main(String[] args) {
		childDemo cd = new childDemo();
		cd.getString();
		cd.getData();

	}

}
