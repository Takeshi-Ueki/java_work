package test;

public class Main {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.setNo(1010);
		myCar.run(50);

		myCar.display();

		System.out.println("----------");

		myCar.stop();

		myCar.display();
	}
}
