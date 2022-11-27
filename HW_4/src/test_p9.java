
public class test_p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	RacingCar3rd rccar1;
	rccar1 = new RacingCar3rd();
	
	rccar1.newShow();
	}

}

class Car3rd{
	protected int num;
	protected double gas;
	
	public Car3rd() {
		num = 0;
		gas = 0.0;
		System.out.println("Produced a car.");
	}
	
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("Set the car number to "+num+", gasoline volume is set to "+gas+".");
	}
	
	public void show() {
		System.out.println("The car number is "+num+".");
		System.out.println("The gasoline volume is "+gas+".");
	}
}

class RacingCar3rd extends Car3rd{
	private int course;
	
	public RacingCar3rd() {
		course = 0;
		System.out.println("Produced a racingcar.");
	}
	
	public void setCourse(int c) {
		course=c;
		System.out.println("Set the racingcar number to "+course+".");
	}
	public void newShow() {
		System.out.println("The racingcar number is "+num+".");
		System.out.println("The gasoline volume is "+gas+".");
		System.out.println("The racingcar serial number is "+course+".");
	}
}
