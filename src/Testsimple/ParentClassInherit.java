package Testsimple;

public class ParentClassInherit {

	String colour = "Red";
	
	public void gear() {
		System.out.println("Gear code is implemented");
	}
	
	public void brake() {
		System.out.println("brake code is implemented");
	}
	
	public void audiosystem() {
		System.out.println("Parent audiosystem code is implemented");
	}
	
	public static void main(String[] args) {
		ParentClassInherit obj = new ParentClassInherit();
		obj.audiosystem();
		obj.gear();
		System.out.println(obj.colour);
	}

}
