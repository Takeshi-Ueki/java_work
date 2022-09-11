public class Omikuji2 {
	public static void main(String[] args) {
		String data = "大吉,吉,小吉,凶";
		String[] omikuji = data.split(",");
		
		int rand = (int)(Math.random() * omikuji.length);
		System.out.println("あなたの運勢は" + omikuji[rand] + "です");
	} 
}