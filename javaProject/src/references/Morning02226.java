package references;

//int 영어성적 담을 수 있는 배열 .engScores = 3
//int 수학성적 담을 수 있는 배열 .mathScores = 3
public class Morning02226 {
	public static void main(String[] args) {

		morning02226();

	}

	public static void morning02226() {
		int[] engScores = { 86, 90, 80 };
		int[] mathScores = { 90, 80, 70 };
		double engSum = 0;
		double mathSum = 0;
		double engAvg = 0;
		double mathAvg = 0;

		for (int i = 0; i < engScores.length; i++) {
			engSum += engScores[i];
		}
		engAvg = engSum / engScores.length;
		for (int i = 0; i < mathScores.length; i++) {
			mathSum += mathScores[i];
		}
		mathAvg = mathSum / mathScores.length;
		System.out.println("수학 평균 : " + mathAvg + " / " + "영어 평균 : " + engAvg);
	}
}
