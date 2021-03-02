package objects;

public class StudentsExample {
	public static void main(String[] args) {
		
		Students s1 = new Students("홍길동", 90, 85);
		Students s2 = new Students("김길동", 88, 85);
		Students s3 = new Students("이길동", 76, 90);
		Students s4 = new Students();
//		s4.name = "최길동";
		s4.setName("최길동");
//		s4.eng = 70;
		s4.setEng(-70);
//		s4.math = 80;
		s4.setMath(80);
		System.out.println(s4.getMath());
		
		new Students();
		
		Students[] students1 = new Students[4];
		students1[0] = s1;
		students1[1] = s2;
		students1[2] = s3;
		students1[3] = s4;

		for (Students students : students1) {
			students.showinfo();
		}
	}
}
