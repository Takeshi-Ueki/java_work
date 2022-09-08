public class attack {
	public static void main (String[] args) {
		int hp = 100;
		int i = 1;
		while (hp > 0) {
			int attack = (int)(Math.random() * 10 + 1);
			System.out.println(i + "回目の攻撃！");
			System.out.println("スライムに" + attack + "のダメージ！");
			hp = hp - attack;
			if (hp <= 0) {
				System.out.println("スライムの残りHPは" + 0);
			} else {
				System.out.println("スライムの残りHPは" + hp);				
			}
			System.out.println("━━━━━━━━━━━━━━━━━━━━");
			i++;
		}
		System.out.println("スライムを倒した");
	}
}
