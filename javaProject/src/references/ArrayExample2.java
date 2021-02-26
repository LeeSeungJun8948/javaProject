package references;

import java.util.Scanner;

//배열 10개 랜덤으로 1~100 값 넣고 짝수만 sum = 배열 합 // avg = 토탈 평균 // int 타입 변수 선언 cnt if만족하면 1씩증가
public class ArrayExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arrays = new int[10]; // int형 크기가 10인 배열 선언
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(arrays[0]);
		System.out.println(arrays[1]);
		System.out.println(arrays[2]);
		System.out.println(arrays[3]);
		System.out.println(arrays[4]);
		System.out.println(arrays[5]);
		System.out.println(arrays[6]);
		System.out.println(arrays[7]);
		System.out.println(arrays[8]);
		System.out.println(arrays[9]);

		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i] % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("짝수값의 합은? " + sum);

		sum = 0;
		for (int i = 0; i < arrays.length; i++) {
			sum += arrays[i];
		}
		avg = sum / (double) arrays.length;
		System.out.println("평균 값은 ? " + (double) avg);

		int count = 0;
		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i] % 2 == 0) {
				count += 1;
			}
		}
		System.out.println("짝수의 개수는 ? " + count);
		
		while (true) {
			System.out.print("배열의 위치 입력 : ");
			int loc = scn.nextInt();
			if (loc < 0) {
				break;
			}
			System.out.println(loc + "위치값은: " + arrays[loc]);
		}
		scn.close();
	}
}
