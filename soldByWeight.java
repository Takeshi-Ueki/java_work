public class soldByWeight {
	public static void main(String[] args) {
		int price = 128;
		int weight = 300;
		int amount = (int)(price / 100.0 * weight);
		System.out.println("100グラム" + price + "円の肉、" + weight + "グラムは、" + amount + "円です。");
	}
}