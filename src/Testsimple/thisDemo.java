package Testsimple;

public class thisDemo extends staticVar {
	

	thisDemo(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	int a = 5; // Global or instance variable

	public void getData() {
		int a = 3; // Local variable
		int k = a + this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(k);
	}
 
	public static void main(String[] args) {

		thisDemo td = new thisDemo("", "");
		td.getData();
		
		System.out.println(td.a);
		System.out.println(staticVar.city);
		System.out.println(td.j);

		staticVar ob = new staticVar(city, city);
		staticVar.getCity();
		
	}

}
