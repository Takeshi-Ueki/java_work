import java.util.Scanner;

public class ScannerMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int answer = 0;
        
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            if (answer < num) {
                answer = num;
            }
        } 
        
        System.out.println(answer);
        
        sc.close();
	}
}