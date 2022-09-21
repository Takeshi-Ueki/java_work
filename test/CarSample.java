package test;

public class CarSample {
	public static void main(String[] args) {
		Car1.countDisplay();
		
		Car1 myCar = new Car1();
		
		myCar.setNo(1234);
		myCar.run(40);
		myCar.display();
		
		myCar.brake(20);
		myCar.display();
		
		myCar.brake();
		myCar.display();
		Car1.countDisplay();
		
		System.out.println("--------------------");
		
		Car1 myCar2 = new Car1();
		myCar2.display();
		Car1.countDisplay();
		
		Car1 myCar3 = new Car1(5678);
		myCar3.display();
		Car1.countDisplay();
	}
}
