
public class test_p29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1st[] vc = new Vehicle1st[2];
		
		vc[0] = new Car10th(1234,20.5);
		vc[0].setSpeed(60);
		vc[1] = new Plane1st(232);
		vc[1].setSpeed(500);
		
		for(int i=0;i<vc.length;i++) {
			vc[i].show();
		}
	}

}

abstract class Vehicle1st{
	protected int speed;
	public void setSpeed(int s) {
		speed = s;
		System.out.println("Set speed to "+speed+".");
	}
	
	abstract void show();
}

class Car10th extends Vehicle1st{
	private int num;
	private double gas;
	
	public Car10th(int n,double g) {
		num=n;
		gas=g;
		System.out.println("A car with car number "+num+" and gasoline volume "+gas+" is produced.");
	}
	public void show() {
		System.out.println("The car number is "+num+".");
		System.out.println("The gasoline volume is "+gas+".");
		System.out.println("The speed is "+speed+".");
	}
}

class Plane1st extends Vehicle1st{
	private int flight;
	
	public Plane1st(int f) {
		flight=f;
		System.out.println(flight+" flight was produced.");
	}
	
	public void show() {
		System.out.println("The flight number of the plane is "+flight);
		System.out.println("The speed is "+speed);
	}
}