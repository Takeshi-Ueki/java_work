public class Scope {
	public static void main(String[] args) {
		int num = 0;
		if (num == 0) {
			String msg = "paiza";
			System.out.println(msg + num);
		}
		
		// ブロックの中で宣言した変数はブロックの外では使えない	
		// System.out.println(msg);
		
		for (int i = 1; i < 5; i++) {
			String msg = "Java";
			System.out.println(msg + i);
		}
		
		// System.out.println(msg);
	}
}