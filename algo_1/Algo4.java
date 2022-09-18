package algo_1;

import java.util.Scanner;

public class Algo4 {
    public static void main(String[] args) {
    	System.out.println("入力した要素の最大値と最小値を求めます。");
    	System.out.println("１行目 : 要素の数");
    	System.out.println("２行目 : 要素 (スペース区切り)");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int max = -10000;
        int min = 10000;
        
        // paiza 模範回答       
        for (int value : a) {
            max = Math.max(max, value);
            min = Math.min(min, value);
        }
        
        // 自分で書いたコード       
        // for (int i = 0; i < n; i++) {
        //     if (max < a[i]) {
        //         max = a[i];
        //     } else if (min > a[i]) {
        //         min = a[i];
        //     }
        // }
        
        System.out.println("最大値 : " + max);
        System.out.println("最小値 : " + min);
        
        sc.close();
    }
}
