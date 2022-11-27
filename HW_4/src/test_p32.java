
public class test_p32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle2nd[] vc;
		vc= new Vehicle2nd[2];
		
		vc[0] = new Car11th(1234,20.5);
		vc[1] = new Plane2nd(232);
		
		for(int i=0;i<vc.length;i++) {
			if(vc[i] instanceof Car11th)
				System.out.println("The "+(i+1)+"-th object is of the Car category");
			else
				System.out.println("The "+(i+1)+"-th object is not of the Car category");
		}
	}

}

abstract class Vehicle2nd{
	protected int speed;
	public void setSpeed(int s) {
		speed = s;
		System.out.println("Set speed to "+speed+".");
	}
	
	abstract void show();
}

class Car11th extends Vehicle2nd{
	private int num;
	private double gas;
	
	public Car11th(int n,double g) {
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

class Plane2nd extends Vehicle2nd{
	private int flight;
	
	public Plane2nd(int f) {
		flight=f;
		System.out.println(flight+" flight was produced.");
	}
	
	public void show() {
		System.out.println("The flight number of the plane is "+flight+".");
		System.out.println("The speed is "+speed+".");
	}
}