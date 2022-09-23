package lesson4_4;

public final class StuSample4 {
	public static void main(String[] args) {
		final int BASE_NO = 1000;
		//  final で宣言した定数は代入ができない		
		//	BASE_NO = 2000;
		
		Student4 stu1 = new Student4("田中", BASE_NO + 1);
		stu1.display();
		Student4 stu2 = new Student4("佐藤", BASE_NO + 2);
		stu2.display();
	}
}
