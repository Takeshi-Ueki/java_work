package algo_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int count = 0;
        
        for (int value : a) {
            if (value == k) {
                count++;
            }
        } 
        
        System.out.println(count);
        sc.close();
    }
}
