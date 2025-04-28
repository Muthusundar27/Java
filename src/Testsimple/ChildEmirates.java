package Testsimple;

public class ChildEmirates extends ParentAircrafts{

	public static void main(String[] args) {
		ChildEmirates obj = new ChildEmirates();
		obj.bodycolour();
		obj.engine();
		obj.safetyGuidelines();
		System.out.println(obj.i);
		
//		ParentAircrafts p = new ParentAircrafts();
	}

	@Override
	public void bodycolour() {
		// TODO Auto-generated method stub
		System.out.println("abstract methods");
	} 


}
