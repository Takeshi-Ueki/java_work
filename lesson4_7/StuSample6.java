package lesson4_7;

public class StuSample6 {
	public static void main(String[] args) {
	    TandF taf = new TandF("陸上部");
	    Football fb = new Football("サッカー部");
	    
	    Student6 stu1 = new Student6("田中", taf);
	    stu1.display();
	    stu1.practice();
	    
	    Student6 stu2 = new Student6("佐藤", fb);
	    stu2.display();
	    stu2.practice();
	}
}
