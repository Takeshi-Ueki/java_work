package algo_1;
import java.util.Scanner;

public class Algo2 {
    public static void main(String[] args) {
    	System.out.println("１行目 配列のサイズn");
    	System.out.println("２行目 配列の要素 (スペース区切り)");
    	System.out.println("配列の何番目に存在するかを検索する要素");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        int answer = -1;
        
        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                answer = i + 1;
                break;
            } 
        } 
        
        System.out.println(answer);
        
        sc.close();
    }
}
