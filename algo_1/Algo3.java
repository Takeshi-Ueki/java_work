package algo_1;
import java.util.Scanner;

public class Algo3 {
	public static void main(String[] args) {
		System.out.println("偶数の検索");
		System.out.println("１行目 サイズn");
		System.out.println("２行目 配列の要素(スペース区切り)");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int answer = -1;
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                answer = i + 1;
                break;
            } 
        }
        
        System.out.println(answer);
        
        sc.close();
	}
}