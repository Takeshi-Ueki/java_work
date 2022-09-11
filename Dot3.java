// 2次元配列で地図を表示する2

public class Dot3 {
    public static void main(String[] args) {

        String[][] worldMap = new String[10][20];
        worldMap[0][0] = "城";
        worldMap[0][19] = "町";
        worldMap[9][19] = "町";

        for (int i = 0; i < worldMap.length; i++) {
            System.out.print(i + ":");
            for (int j = 0; j < worldMap[i].length; j++) {
                if (worldMap[i][j] == null) {
                    if (i % 2 == 0 || j % 3 == 0) {
                        worldMap[i][j] = "＋";
                    }else {
                        worldMap[i][j] = "森";
                    }
                }
                System.out.print(worldMap[i][j]);
            }
            System.out.println("");
        }
    }
}