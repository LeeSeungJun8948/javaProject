package abstractClasses;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		
		showCal(2021, 6);
	}
	// 오늘날짜 기준 0 1 2 3 4 5 6 7 8 9

	/*
	 * System.out.println(cal.get(Calendar.YEAR));
	 * System.out.println(cal.get(Calendar.MONTH));
	 * System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	 * System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	 * System.out.println(cal.getActualMaximum(Calendar.DATE));
	 * System.out.println("----------------------------"); // cal.set(2021, 2, 5);
	 * // cal 변수 값 => 2021년 5월 1일 System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	 * 
	 * System.out.printf("%2d", 9); System.out.printf("%3d", 10);
	 * System.out.printf("%5s", "Sun"); System.out.printf("%5s\n", "Mon");
	 * System.out.println("----------------------------");
	 */
// 	Sun Mon Tue Wed Thu Fri Sat
//		    1  2  3  4  5  6  
//		 7  8  9 10 11 12 13 
//		14 15 16 17 18 19 20
//		21 22 23 24 25 26 27
//		28 29 30 31

	public static void showCal(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK); // 일 / 월 / 화 / 수 / 목 / 금 / 토

		for (int i = 1; i < firstDay; i++) {
			System.out.printf("%3s", " ");
		}
		for (int i = 1; i <= lastDate; i++) {

			System.out.printf("%3d", i);
			if ((i + firstDay - 1) % 7 == 0) {
				System.out.println();
			}
		}
	}
}
