public class Static {
	public static void main(String[] args) {
		// 国語 = 70点、算数 = 43点
	     int total = Gakusei2.sum(70, 43);
	     System.out.println("合計は" + total + "点です。");
	}
}

class Gakusei2 {
	 public static int sum(int x, int y) {
	     return x + y;
	 }
}
