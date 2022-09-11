public class TwoArray2 {
	public static void main(String[] args) {
		String[] teamA = {"勇者", "戦士", "魔法使い"};
		String[] teamB = {"盗賊", "山賊", "海賊"};
		String[] teamC = {"スライム", "ゴブリン", "コボルト"};
		
		String[][] teams = {teamA, teamB, teamC};
		
		for (int i = 0; i < teams.length; i++) {
			for (int j = 0; j < teams[i].length; j++) {
				System.out.println(teams[i][j]);
			}
		}		
	}
}