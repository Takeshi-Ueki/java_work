public class Dot {
	public static void main(String[] args) {
		int[][] enemyImage =
            {{0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0},
             {0,0,0,1,0,1,0,0,0,0,1,1,1,0,0,0},
             {0,0,1,0,0,0,0,1,1,1,1,1,1,1,0,0},
             {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
             {1,0,0,1,1,1,0,0,0,0,1,1,1,0,0,1},
             {1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1},
             {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0}};

        for (int[] i : enemyImage) {
            for (int dot : i) {
                if (dot == 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
	}
}