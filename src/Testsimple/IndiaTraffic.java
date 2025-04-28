package Testsimple;

public class IndiaTraffic implements CentralTraffic {
//	private int i=5;
	public static void main(String[] args) {				
		CentralTraffic obj = new IndiaTraffic();
		obj.redStop();
		obj.greenGo();
		obj.yellowWait();
//		obj.wa
		System.out.println(obj.i);
		
		IndiaTraffic obj2 = new IndiaTraffic();
		obj2.greenGo();
		obj2.walkingSymbol();
		System.out.println(obj2.i);	
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green Go Implemented");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop Implemented");
	}

	@Override
	public void yellowWait() {
		// TODO Auto-generated method stub
		System.out.println("Yellow Wait Implemented");
	}

	public void walkingSymbol() {
		System.out.println("Walking Implemented");
	}
}
