// 戻り値を追加する場合はvoid→戻り値の型
// voidは戻り値がない場合

public class Method1 {
	public static void main(String[] args) {
        int num1 = sum(100, 200);
        System.out.println(num1);
        int num2 = sum(500, 300);
        System.out.println(num2);
    }
    public static int sum(int x, int y) {
        return x + y;
    }
}