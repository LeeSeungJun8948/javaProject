package references;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("_________________________________________________");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("_________________________________________________");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores" + "[" + i + "]> ");
					int score = scanner.nextInt();
					scores[i] = score;
				}
			} else if (selectNo == 3) {
				System.out.println("scores[0]: " + scores[0]);
				System.out.println("scores[1]: " + scores[1]);
				System.out.println("scores[2]: " + scores[2]);
			} else if (selectNo == 4) {
				int maxValue = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (scores[i] > maxValue) {
						maxValue = scores[i];
					}
				}
				avg = sum / (double) scores.length;
				System.out.println("평균 값은 ? " + (double) avg);
				System.out.println("최고 점수: " + maxValue);
			} else if (selectNo == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}

		}
	}
}
