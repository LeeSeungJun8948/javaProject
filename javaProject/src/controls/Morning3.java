package controls;

public class Morning3 {
	public static void  main (String[] args) {
	String result = getAverage(80, 80) ;
		System.out.println("결과는 " + result);
	}
	
	public static String getAverage(int n1, int n2) {
		int avg = (n1 + n2)/2;
		String grade = "";
		if(avg >= 90) {
			grade = "수";
		}else if (avg >= 80) {
		grade = "우";
		} else if (avg >= 70) {
		grade = "미";
		}
		else {
		grade = "가";
		}
		return grade;
	}
}

