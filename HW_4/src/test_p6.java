
public class test_p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar2nd rccar1 = new RacingCar2nd(1234,20.5,5);
	}

}

class Car2nd{
	private int num;
	private double gas;
	
	public Car2nd() {
		num = 0;
		gas = 0.0;
		System.out.println("Produced a car");
	}
	
	public Car2nd(int n,double g) {
		num=n;
		gas=g;
		System.out.println("Produced a car with num "+num+", gasoline quantity "+gas);
	}
	
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("Set the vehicle number to "+num+", gasoline volume is set to "+gas);
	}
	
	public void show() {
		System.out.println("the vehicle number is "+num);
		System.out.println("the gasoline volume is "+gas);
	}
}

class RacingCar2nd extends Car2nd{
	private int course;
	
	public RacingCar2nd() {
		course = 0;
		System.out.println("Produced a racingcar");
	}
	
	public RacingCar2nd(int n,double g,int c) {
		super(n,g);
		course=c;
		System.out.println("Produced a racing car numbered "+course);
	}
	
	public void setCourse(int c) {
		course=c;
		System.out.println("Set the racingcar number to "+course);
	}
	
}