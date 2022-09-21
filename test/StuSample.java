package test;

public class StuSample {
	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		stu1.setData("田中");
		stu1.setScore(95, 52);
		stu1.display();
		
		stu2.setData("鈴木", 72, 78);
		stu2.display();
		
		Student2 stu3 = new Student2("佐藤");
		stu3.display();
		
		Student2 stu4 = new Student2("山田", 100, 100);
		stu4.display();
	}
}
