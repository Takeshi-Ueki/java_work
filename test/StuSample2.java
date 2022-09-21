package test;

public class StuSample2 {
	public static void main(String[] args) {
		
		Student2.countDisplay();
		
		Student2 stu1 = new Student2("佐藤");
		stu1.display();
		
		Student2 stu2 = new Student2("山田", 100, 100);
		stu2.display();
		
		Student2.countDisplay();
	}
}
