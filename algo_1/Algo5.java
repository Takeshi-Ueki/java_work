package algo_1;

import java.util.Scanner;

public class Algo5 {
    public static void main(String[] args) {
    	System.out.println("a[]の中のk番目に大きい要素を見つける");
    	System.out.println("1行目 要素の数");
    	System.out.println("2行目 要素 (スペース区切り)");
    	System.out.println("3行目 k 何番目に大きい要素を検索するか");
    	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        int maximum = 10000;
        
        for (int i = 0; i < k; i++) {
            int nextMaximum = -10000;
            
            for (int value : a) {
                if (value < maximum) {
                	System.out.println(value + "<" + nextMaximum);
                    nextMaximum = Math.max(nextMaximum, value);
                } 
                System.out.println(value);
            }
            maximum = nextMaximum;
            System.out.println(i + 1 + "回目 " + maximum);
            System.out.println("----------");
        }
        
        System.out.println(maximum);
        
        sc.close();
    }
}
