package controls;

public class Morning0224 {
	public static void main(String[] args) {
		int m = 90;
		int e = 90;
		int avg = (m+e)/2;
		String grade = "F";
		
		if(avg >= 90) {
			grade = "수";
		}
		else if (avg >= 80) {
			grade = "우";
		}
		else if (avg >= 70) {
			grade = "미";
		}
		else {
			grade = "가";
		}
		System.out.println("수학 점수는 : " + m + " , 영어 점수는 : " + e + " 평균 : " + avg);
		System.out.println("등급은 " + grade + " 입니다.");
	}
}


