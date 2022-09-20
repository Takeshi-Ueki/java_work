package test;

public class Car {
	private int no;
	private int speed;

	//　noを設定	
	public void setNo(int n) {
		no = n;
	}
	
	//　speedを設定	
	public void run(int s) {
		speed = s;
	}

	// speedに0を設定			
	public void stop() {
		speed = 0;
	}

	// noとspeedを出力	
	public void display() {
		System.out.println("No." + no + "の速度は" + speed + "です。");
	}
}
