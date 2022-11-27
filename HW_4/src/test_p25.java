
public class test_p25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car8th car1 = new Car8th();
		Car8th car2 = new Car8th();
		
		Car8th car3;
		car3=car1;
		
		System.out.println("car1 is the same as car2 "+car1.equals(car2)+".");
		System.out.println("car1 is the same as car3 "+car1.equals(car3)+".");
	}

}

class Car8th{
	protected int num;
	protected double gas;
	
	public Car8th() {
		num = 0;
		gas = 0.0;
		System.out.println("Produced a car.");
	}
}