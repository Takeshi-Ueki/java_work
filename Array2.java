public class Array2 {
	public static void main(String[] args) {
		String[] team = {"勇者", "戦士", "魔法使い", "忍者"};
		System.out.println("<select name='job'>");
		for (String member : team) {
			System.out.println("<option>" + member + "</option>");
		}
		System.out.println("</select>");
	}
}