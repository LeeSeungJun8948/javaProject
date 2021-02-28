package homework;

import java.util.Scanner;

public class Jjh {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] students = null;
		while (true) {
			System.out.println("_____________________________________________________________________________________");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.조회 | 5.영어최고점 | 6.합계최고 | 7.수학평균점이상 | 8.종료");
			System.out
					.println("______________________________________________________________________________________");
			System.out.print("선택> ");

			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.print("학생수 > ");
				int studentNum = scn.nextInt();
				students = new int[studentNum][3];
			} else if (menu == 2) {
				for (int i = 0; i < students.length; i++) {
					System.out.print("학생번호>>");
					students[i][0] = scn.nextInt();
					System.out.print("영어점수>");
					students[i][1] = scn.nextInt();
					System.out.print("수학점수>");
					students[i][2] = scn.nextInt();
				}
			} else if (menu == 3) {
				for (int i = 0; i < students.length; i++) {
					System.out.println("학생정보 - 번호:" + students[i][0] + ", " + "영어:" + students[i][1] + ", " + "수학:"
							+ students[i][2]);
				}

			} else if (menu == 4) {
				System.out.print("찾고자 하는 학생정보 입력 > ");
				int id = scn.nextInt();
				for (int i = 0; i < students.length; i++) {
					if (id == students[i][0]) {
						System.out.println("학생정보 - 번호:" + students[i][0] + ", " + "영어:" + students[i][1] + ", " + "수학:"
								+ students[i][2]);
					}
				}
			} else if (menu == 5) {
				int[] engTemp = students[0];
				for (int i = 0; i < students.length; i++) {
					if (engTemp[1] < students[i][1]) {
						engTemp = students[i];
					}
				}
				System.out.println("영어최고점 : 학생번호 - " + engTemp[0]  + "/ 영어 : " + engTemp[1]);
			} else if (menu == 6) {
				int[] avgTemp = students[0];
				for (int i = 0; i < students.length; i++) {
					if (avgTemp[1] + avgTemp[2] < students[i][1] + students[i][2]) {
						avgTemp = students[i];
					}
				}
				System.out.println("학생번호 : " + avgTemp[0] + " 평균점수 : " + (double)(avgTemp[1] + avgTemp[2])/2 );

			} else if (menu == 7) {
				int mathSum = 0;
				for (int i = 0; i < students.length; ++i) {
					mathSum += students[i][2];
				}
				System.out.println("avg :" + (double)(mathSum/students.length));
				for (int i =0; i < students.length; ++i) {
					if (mathSum < students[i][2]) {
						System.out.println("student:" + students[i][0] + ", " + students[i][2]);
					}
				}
			}
		}
	}
}
