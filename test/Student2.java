package test;

public class Student2 {
	private String name;
	private int mathScore;
	private int engScore;
	// static で共通で使える変数を定義	
	static int counter;
	
	// コンストラクタ		
	Student2(String name) {
		this.name = name;
		counter++;
	}
	// コンストラクタ	
	Student2(String name, int mathScore, int engScore) {
		this.name = name;
		this.mathScore = mathScore;
		this.engScore = engScore;
		counter++;
	}
	
	public void display() {
		System.out.println(name + ":" + "数学" + mathScore + " 英語" + engScore);
	}
	// staticでオブジェクトが生成されていなくても実行できるメソッド	
	static void countDisplay() {
		System.out.println(counter + "人です。");
	}
}
