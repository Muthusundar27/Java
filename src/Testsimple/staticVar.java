package Testsimple;

public class staticVar{

	String name;   // instance varaibles
	String address;
	static String city = "bangalore"; //class variables
	static int i=0;
	final int j=1;
//	
//	static {
//		city = "Bangalore";
//		i = 0;
//	}
	staticVar(String name, String address){
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);

//		this.city = city;
	}
	
	public void getAddress() {
		System.out.println(address + " "+ city);
	}
	
	public static void getCity() {
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		staticVar obj = new staticVar("Sundar", "Memphis", "Bangalore");
//		staticVar obj1 = new staticVar("Muthu", "austin", "Bangalore");
		staticVar obj = new staticVar("Sundar", "Memphis");
		staticVar obj1 = new staticVar("Muthu", "Austin");
		obj.getAddress();
		obj1.getAddress();
		staticVar.getCity();
		staticVar.i=5 ;
		obj.address= "STreet";		
	}

}
