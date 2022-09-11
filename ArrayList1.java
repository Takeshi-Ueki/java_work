import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> team = new ArrayList<String>();
		
		team.add("勇者");
		team.add("魔法使い");
		
		System.out.println(team.size());
		
		team.set(1, "魔法剣士");
		team.add("戦士");
		
		for (String member : team) {
			System.out.println(member);
		}
		
		System.out.println(team.size());
		
		team.remove(2);
		
		for (String member : team) {
			System.out.println(member);
		}
		System.out.println(team.size());
	}
}