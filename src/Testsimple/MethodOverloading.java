package Testsimple;

public class MethodOverloading {

	public void getData(int a) {
		System.out.println(a);
	}
	
	public void getData(String s) {
		System.out.println(s);
	}
	
	public void getData(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo = new MethodOverloading();
		mo.getData(5);
		mo.getData("Hello");
		mo.getData(2, 5);
				
	}

}
