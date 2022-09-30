package chapter3;

import java.util.Scanner;

public class Q3_6 {
	public static void main(String[] args) {
		System.out.println("【数当てゲーム】");
		int ans = new java.util.Random().nextInt(10);
		System.out.println(ans);
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("0~9を入力してください");
			int num = sc.nextInt();
			if (ans == num) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
		
		sc.close();
	}
}
