package Testsimple;

public class ChildClassInherit extends ParentClassInherit {

	public void audiosystem() {
		System.out.println("Child audiosystem code is implemented");
	}
	
	public void engine() {
		System.out.println("New Engine is implemeted");
	}
	
	public void colour() {
		System.out.println(colour);
	}

	public static void main(String[] args) {
		ChildClassInherit obj = new ChildClassInherit();
//		ParentClassInherit obj1 = new ParentClassInherit();
//		obj1.audiosystem();
		obj.colour();
		obj.audiosystem();
		obj.brake();
//		System.out.println(obj.colour);
	}

}
