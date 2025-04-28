package Testsimple;

public class constructorDemo {

//	Default constructor
	public constructorDemo(){
		System.out.println("I am the constructor.");
	}
	
//	method
	public static void getData() {
		System.out.println("I am the method.");
	}
	
//	parameterized constructor
	public constructorDemo(int a, int b){
		System.out.println("I am the parameterized constructor.");
	}
	
	public constructorDemo(String str){
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
//		constructorDemo cd = new constructorDemo();
		constructorDemo cd1 = new constructorDemo(1, 5);		
		getData();
		
	}

}
