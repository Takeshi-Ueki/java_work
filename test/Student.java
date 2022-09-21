package test;

public class Student {
	private String name;
	private int mathScore;
	private int engScore;
	
	public void setData(String name) {
		this.name = name;
	}
	public void setData(String name, int mathScore, int engScore) {
		this.name = name;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}
	public void setScore(int mathScore, int engScore) {
		this.mathScore = mathScore;
		this.engScore = engScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	
	public void display() {
		System.out.println(name + ":" + "数学" + mathScore + " 英語" + engScore);
	}
}
