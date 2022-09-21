package test;

public class Car1 {
	private int no;
	private int speed;
	private static int counter;
	
	public Car1() {
		no = 0;
		counter++;
	}
	public Car1(int n) {
		no = n;
		counter++;
	}
	
	public void setNo(int n) {
		no = n;
	}
	public void run(int s) {
		speed = s;
	}
	public void brake() {
		speed = 0;
	}
	public void brake(int s) {
		speed -= s;
	}
	public void display() {
		System.out.println("No." + no + "の速度は" + speed + "kmです。");
	}
	public static void countDisplay() {
		System.out.println(counter + "台です。");
	}
}
