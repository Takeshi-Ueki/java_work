import java.util.Scanner;


public class ScannerFizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for (int i = 1; i <= number; i++) {
            if (i % n == 0 && i % m == 0) {
                System.out.println("AB");
            } else if (i % n == 0) {
                System.out.println("A");
            } else if (i % m == 0) {
                System.out.println("B");
            } else {
                System.out.println("N");
            }
        }
        
        sc.close();
    }
}