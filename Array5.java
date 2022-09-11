import java.util.Scanner;

public class Array5 {
	public static void main(String[] args) {
		System.out.println("モンスター名,数");
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] list = line.split(",");
			System.out.println(list[0] + "が" + list[1] + "匹現れた");
		}
		
		sc.close();
 	}
}