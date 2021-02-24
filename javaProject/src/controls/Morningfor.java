package controls;

public class Morningfor {
	public static void main(String[] args) {
		int result = getSum(11, 30);
		System.out.println("11부터 30까지 합은 : " + result);
	}

	public static int getSum(int a, int b) {
		int sum = 0;
		for (int i = a; i<=b; i++) {
			sum += i;
		}
		return sum;
	}
}
