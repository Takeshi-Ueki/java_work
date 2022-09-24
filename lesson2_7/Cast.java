package lesson2_7;

import java.util.Scanner;

public class Cast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
//		int price = Integer.parseInt(args[0]);
		double rate = 0.08;
		int amount;
		
		amount = (int)(price * (1 + rate));
		System.out.println("税込金額:" + amount + "円");
		
		sc.close();
	}
}
