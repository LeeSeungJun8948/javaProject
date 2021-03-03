package objects;

public class Student {
	//속성(필드)
	String studentNo;
	int grade;
	int math;
	int eng;
	
	//생성자 : 필드 값을 초기화 할때 사용
	public Student() {
		System.out.println("생성자를 호출합니다.");
	}
	
	Student(String studentNo) {
		this.studentNo = studentNo; // object의 student 인스턴스 를 의미(this.)
	}
	
	Student(int grade, int eng, int math){
		this.grade = grade;
		this.eng = eng;
		this.math = math;
	}
	
	public void study() { // study라는 기능을 담당하는 메소드
		System.out.println("공부합니다.");
	}
	
	public void run() { 
		System.out.println("운동을 합니다.");
	}
	
	public void introduce() {
		System.out.println("학번: " + studentNo  + ", " + "학년: " + grade + ", " + "영어점수: " + eng + ", " + "수학점수: " + math);
	}
}
