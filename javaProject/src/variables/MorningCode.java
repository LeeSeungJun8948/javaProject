package variables;

public class MorningCode {
	public static void main(String[] args) {
		int a = 25; // 기준나이
		int b = 27; // 내나이
		if (a<b) { // 내나이가 기준나이보다 많을경우
			System.out.println("나이가 좀 들었습니다.");
		}
		else if (a==b) {  // 내나이가 기준나이와 같을경우
			System.out.println("한창이네요");
		}
		else {  // // 내나이가 기준나이보다 적을경우
			System.out.println("적정한 나이입니다.");
		}
	}
}
