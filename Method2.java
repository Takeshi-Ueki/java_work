// 九九の表を作成してみよう

public class Method2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i ++) {
            for (int num = 1; num <= 9; num++) {
                System.out.print(multi(i, num));
                if (num < 9) {
                    System.out.print(", ");
                } else {
                    System.out.println("");
                }
            }
        }
    }

    public static int multi(int x, int y) {
        return x * y;
    }
}
