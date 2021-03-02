package objects;

public class Students {
	private String name;
	private int eng;
	private int math;
	
	
	Students(){
		
	}
	
	Students(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	public void showinfo() {
		System.out.println("이름 - " + this.name + " 영어 - " + this.eng + " 수학 - " + this.math +" 합계 : " + (eng+math));
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEng(int eng) {
		if(eng <0) {
		this.eng = 0;
		}else {
			this.eng = eng;
		}
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return this.eng;
	}
	
	public int getMath() {
		return this.math;
	}
	
	public String getName() {
		return this.name;
	}
	
}
