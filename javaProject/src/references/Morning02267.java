package references;

public class Morning02267 {
	public static void main(String args[]) {
		String[] names = { "임성원", "정준영", "도왕락" };
		int[] scores = { 88, 89, 90 };
		int sum = 0;
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " 점수 => " + scores[i]);
		}

		for (String name : names) {
			System.out.println(name);
		}
		for (int score : scores) {
			sum += score;
		}
		System.out.println(sum);
	}

	public static void arrayCopy() {
		int[] oldAry = { 45, 55, 67 };
		int[] newAry = new int[3];
		for (int i = 0; i < oldAry.length; i++) {
			newAry[i] = oldAry[i];
		}

		int[] newAry2 = new int[5];
		System.arraycopy(newAry, 1, newAry2, 0, 2);
		System.out.println(newAry2[0]);
		System.out.println(newAry2[1]);
		System.out.println(newAry2[2]);
	}
}
