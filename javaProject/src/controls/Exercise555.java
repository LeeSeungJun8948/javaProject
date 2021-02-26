package controls;

//임의의 값 두수를 35,60
// 35 ~ 60 까지의 합을 구하는 프로그램
public class Exercise555 {
	public static void main(String[] args) {
		int result = getSumValue(60, 35);
		System.out.println("입력 받은 두 값의 합은 ? " + result);
	}

	public static int getSumValue(int a, int b) {
		int sum = 0;
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}
}