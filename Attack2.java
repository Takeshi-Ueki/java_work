import java.util.Scanner;

public class Attack2 {
	public static void main(String[] args) {
//		String sc = "スライム,ドラゴン,魔王";
//		String[] array = sc.split(",");
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		String[] array = data.split(",");
		
		for (String enemy : array) {
			System.out.println(enemy + "が現れた");
		}
		
		int num = array.length;
		System.out.println("敵は" + num + "匹");
		
		double rand = Math.random() * num;
		int attack = (int)rand;
//        System.out.println(rand);
//        System.out.println(attack);
        
        System.out.println(array[attack] + "に会心の一撃!");
        System.out.println(array[attack] + "を倒した。");
        
        sc.close();
	}
}