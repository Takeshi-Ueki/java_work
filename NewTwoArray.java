public class NewTwoArray {
	public static void main(String[] args) {
		String[] array = new String[5];
		
		System.out.println("文字列の配列:初期値はnull");
		for (String string : array) {
			System.out.println(string);
		}
		
		System.out.println(array.length);
		
		int[][] number = new int[5][5];
		
		System.out.println("数字の配列:初期値は0");
		for (int[] i : number) {
			for (int j : i) {
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println("");
			System.out.println("---------------");
		}
		
		int[][] numberA = new int[5][5];
		
		System.out.println("数字の配列:初期化");
		for (int i = 0; i < numberA.length; i++) {
			for (int j = 0; j < numberA[i].length; j++) {
				numberA[i][j] = i * 10 + j;
				System.out.print(numberA[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
			System.out.println("-------------------------");
		}
	}
}