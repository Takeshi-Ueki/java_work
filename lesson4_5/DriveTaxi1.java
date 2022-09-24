package lesson4_5;

public class DriveTaxi1 {
	public static void main(String[] args) {
		Taxi1 taxi = new Taxi1(1234, 420);
//		taxi.setNo(1234);
//		taxi.start();
		taxi.run();
		taxi.display();
	}
}
