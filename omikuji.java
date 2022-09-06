public class omikuji {
	public static void main(String[] args) {
		int omikuji = (int)(Math.random() * 10) + 1;
		
		if (omikuji <= 3) {
			System.out.println("大吉");
		} else if (omikuji <= 5) {
			System.out.println("中吉");
		} else if (omikuji <= 7) {
			System.out.println("小吉");
		} else if (omikuji <= 9) {
			System.out.println("凶");
		} else {
			System.out.println("大凶");
		}
	}
}