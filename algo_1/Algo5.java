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
        
        // 最大値を初期化        
        int maximum = 10000;
        
        // ２回繰り返す        
        for (int i = 0; i < k; i++) {
        	// maximum の次に大きい値を入れる変数を初期化            
        	int nextMaximum = -10000;
            
        	//　maximumと配列a の要素を比較         	
            for (int value : a) {
            	// maximumより大きいか          	
                if (value < maximum) {
                	System.out.println(value + "<" + nextMaximum);
                	// maximum以外で一番大きい要素をnextMaximumに入れる
                    nextMaximum = Math.max(nextMaximum, value);
                }
            }
            // maximumの次に大きい値をmaximumに入れる            
            maximum = nextMaximum;
            System.out.println(i + 1 + "回目 " + maximum);
            System.out.println("----------");
        }
        
        System.out.println(maximum);
        
        sc.close();
    }
}
