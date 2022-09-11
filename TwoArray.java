public class TwoArray {
	public static void main(String args) {
        String[] teamA = {"勇者", "戦士", "魔法使い"};
        String[] teamB = {"忍者", "盗賊", "海賊"};
        // System.out.println(teamA[0]);
        
        // 2次元配列を作成する
        String[][] teams = {teamA, teamB};
        System.out.print(teams[0][0] + ",");
        System.out.print(teams[0][1]);
        System.out.println("");
        System.out.println("-----");
        System.out.print(teams[1][1] + ",");
        System.out.print(teams[1][2]);
	}
}