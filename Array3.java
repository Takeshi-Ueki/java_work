public class Array3 {
	public static void main(String[] args) {
		int[] numbers = {12, 34, 56, 78, 90};
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		System.out.println(sum);
	}
}