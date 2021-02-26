package references;

public class ArrayExample {
	public static void main(String[] args) {
		int score1 = 90;
		int score2 = 91;
		int score3 = 92;
		int score4 = 93;
		int score5 = 94;

		int sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum / 5.0;

		int[] scores = new int[5];
		scores[0] = 90;
		scores[1] = 91;
		scores[2] = 92;
		scores[3] = 93;
		scores[4] = 94;
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		scores[0] = 80;
		scores[1] = 81;
		System.out.println("변경 후");
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println("---------for---------");
		
		sum = 0 ;
		for(int i = 0; i<5; i++) {
			System.out.println(scores[i]);
			sum = sum + scores[i];
		}
		avg = sum / 5.0;
		
	
		int[] scores2 = { 90, 91, 92, 93, 94 };
		System.out.println(scores2[3]);
		System.out.println(scores2[4]);
		
		String[] strs = {"Hello", "good", "nice", "20"};
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
			}
		}
	}
