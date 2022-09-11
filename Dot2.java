// ドットで文字を出力しよう
public class Dot2 {
    public static void main(String[] args) {

        int[][][] letters =
            {{{0,0,1,1,0,0},
             {0,1,0,0,1,0},
             {1,0,0,0,0,1},
             {1,1,1,1,1,1},
             {1,0,0,0,0,1},
             {1,0,0,0,0,1}},
            {{1,1,1,1,1,0},
             {1,0,0,0,0,1},
             {1,1,1,1,1,0},
             {1,0,0,0,0,1},
             {1,0,0,0,0,1},
             {1,1,1,1,1,0}},
            {{0,1,1,1,1,0},
             {1,0,0,0,0,1},
             {1,0,0,0,0,0},
             {1,0,0,0,0,0},
             {1,0,0,0,0,1},
             {0,1,1,1,1,0}}};

        // ここに、ドットを表示するコードを記述する
            for (int[][] i : letters) {
                for (int[] line : i) {
                    for (int dot : line) {
                        if (dot == 1) {
                            System.out.print("@");
                        } else {
                            System.out.print(" ");
                        }
                    }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
