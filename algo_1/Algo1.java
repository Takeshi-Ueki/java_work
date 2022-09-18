package algo_1;

import java.util.Scanner;

public class Algo1 {
    public static void main(String[] args) {
    	System.out.println("１行目 配列のサイズn");
    	System.out.println("２行目 配列の要素 (スペース区切り)");
    	System.out.println("配列に何個存在するか検索する要素");
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
