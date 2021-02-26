package references;

public class Two {
	public static void main(String[] args) {
		int[][] scores = { { 90, 88, 87 }, { 88, 90, 92 } };
		double avg = 0.0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			if (i == 0) {
				avg = (sum * 10) / scores[i].length / 10.0;
				System.out.println("영어의 평균: " + avg);
			} else if (i == 1) {
				avg = (sum * 10) / scores[i].length / 10.0;
				System.out.println("수학의 평균: " + avg);

			}
		}
	}
}
