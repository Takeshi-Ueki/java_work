import java.util.ArrayList;
import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> array = new ArrayList<String>();
        
        while (sc.hasNextLine()) {
			String data = sc.nextLine();
			array.add(data);
		}
		
		for (String str : array) {
		    System.out.println(str);
		}
	
		sc.close();
	}
}