
public class test_p26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car9th[] cars;
		cars = new Car9th[2];
		
		cars[0] = new Car9th();
		cars[1] = new RacingCar9th();
		
		for(int i=0;i<cars.length;i++) {
			Class cl = cars[i].getClass();
			System.out.println("The class of the "+(i+1)+"-th object is "+cl+".");
		}
	}

}

class Car9th{
	protected int num;
	protected double gas;
	
	public Car9th() {
		num = 0;
		gas = 0.0;
		System.out.println("Produced a car.");
	}
}

class RacingCar9th extends Car9th{
	public RacingCar9th() {
		System.out.println("Produced a racingcar.");
	}
}