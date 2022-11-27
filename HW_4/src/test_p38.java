
public class test_p38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iVehicle1st[] ivc;
		ivc = new iVehicle1st[2];
		
		ivc[0] = new Car13th(1234,20.5);
		ivc[1] = new Plane3rd(232);
		
		for(int i=0;i<ivc.length;i++) {
			ivc[i].show();
		}
	}

}

interface iVehicle1st{
	int weight=1000;
	void show();
}

class Car13th implements iVehicle1st{
	private int num;
	private double gas;
	
	public Car13th(int n,double g) {
		num=n;
		gas=g;
		System.out.println("A car with car number "+num+" and gasoline volume "+gas+" is produced.");
	}
	public void show() {
		System.out.println("The car number is "+num+".");
		System.out.println("The gasoline volume is "+gas+".");
	}
}

class Plane3rd implements iVehicle1st{
	private int flight;
	
	public Plane3rd(int f) {
		flight=f;
		System.out.println(flight+" flight was produced.");
	}
	public void show() {
		System.out.println("The flight number of the plane is "+flight+".");
		//System.out.println("The speed is "+speed);
	}
}