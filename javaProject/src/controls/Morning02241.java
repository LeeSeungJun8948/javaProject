package controls;

public class Morning02241 {
	public static void main(String[] args) {
		int sum = 0;
		int v1 = 11;
		int v2 = 30;
		for (int i = v1;  i <= v2; i++) {
			sum += i;

		}
		System.out.println("11부터 30까지 합은 : " + sum);
		sum = 0;
		sum = getSum(v1, v2);
		System.out.println(v1 + "부터 " + v2 + "까지 합은 : " + sum);
	}
	public static int getSum(int a, int b) {
		int sum = 0;
		for (int i = a; i<=b; i++) {
			sum += i;
		}
		return sum;
	}
}
