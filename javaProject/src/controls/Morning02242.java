package controls;

public class Morning02242 {
	public static void main(String[] args) {
		int e = (int)(Math.random()*100) + 1;
		int m = (int)(Math.random()*100) + 1;
		String result = getAverage(e, m);
		System.out.println("수학 점수는 : " + e + " , 영어 점수는 : " + m );
		System.out.println("등급은 " + result + " 입니다.");	
	}	
		public static String getAverage(int n1, int n2) {
		double num = (n1+n2)/2.0;
		String grade = "";
		
		if(num >= 90) {
			grade = "수";
		}
		else if (num >= 80) {
			grade = "우";
		}
		else if (num >= 70) {
			grade = "미";
		}
		else {
			grade = "가";
		}
		return grade;
	}
	
}
