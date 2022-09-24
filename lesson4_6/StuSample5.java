package lesson4_6;

public class StuSample5 {
	public static void main(String[] args) {
		Student5 stu1 = new Student5("田中", 1);
		Person5 psn = stu1;
		psn.display();
		
		
		//  オブジェクトのクラスを特定する、(instanceof)
		//  メモリ上はStudent5を指し示すため、trueになる		
		if (psn instanceof Student5) {
			Student5 stu2 = (Student5)psn;
			stu2.cngStuNo(1001);
			stu2.display();
		}
	}
}
