import java.util.Scanner;

public class Split1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		System.out.println(data);
		
		String[] array = data.split(",");
		
		for (String enemy : array) {
			System.out.println(enemy);
		}
		System.out.println(array.length);
		
		String str = "One cold rainy day when my father was a little boy he met an old alley cat on his street";
		int count = str.split(" ").length;
		
		System.out.println(count);
		
		sc.close();
	}
}