package test;

public class Test {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i ++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}	
		
		int count = 0;
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				count += 1;
				sum += i;
			}
		}
		
		System.out.println("1から10までの偶数の個数:" + count);
		System.out.println("1から10までの偶数の合計" + sum);
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			if (i != 10) {
				System.out.print(",");				
			}
		}
		System.out.println("");
		
		int[] numbers = new int[20];
		int number = 0;
		
		for (int i = 0; i < 20; i++) {
			numbers[i] = number += 5;
			
			System.out.print(numbers[i]);
			if (i <= 10) {
				if (numbers[i] % 2 == 1) {
					System.out.print(",");
				}
			} else if (i < 19) {
				if (numbers[i] % 2 == 0) {
					System.out.print(",");
				}
			}
		}
	}
}
