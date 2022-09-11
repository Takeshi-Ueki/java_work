import java.util.Scanner;

public class ScannerSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        for (int i = 0; i < count; i++) {
            System.out.print("paiza");
            if (i == count - 1) {
                System.out.println("");
            } else {
                System.out.print(" ");
            }
        }
        
        sc.close();
	}
}

/* 
// paizaの模範の答え

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "paiza";

        for (int i = 0; i < n - 1; i++) {
            ans += " paiza";
        }
        
        System.out.println(ans);
    }
} 
*/