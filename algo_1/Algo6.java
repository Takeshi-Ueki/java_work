package algo_1;

// 時差ぼけ
// 入力例
// 3
// 7 5 12
// 3 4 3
// 7 2 12

import java.util.Scanner;

public class Algo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        int max = 1;
        int min = 100;

        // System.out.println((7 + 5) - 12);
        // System.out.println((10 + 6) - 20);
        // System.out.println((12 + 3) - 8);
        
        for (int i = 0; i < a.length; i++) {
            int jisa = (a[i][0] + a[i][1]) -a[i][2];
            int sum = 24 + jisa;
            // System.out.println(sum);
            if (max < sum) {
                max = sum;
            }
            if (min > sum) {
                min = sum;
            }
        }
        
        System.out.println(min);
        System.out.println(max);
        
        // for (int i = 0; i < a.length; i++) {
        //     int sum = 0;
        //     for (int val : a[i]) {
        //         sum += val;
        //     }
        //     if (max < sum) {
        //         max = sum;
        //     }
        //     System.out.println(max);
        // }
        sc.close();
    }
}
