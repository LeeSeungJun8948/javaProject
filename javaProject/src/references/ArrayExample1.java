package references;
//인트형 5개 배열
public class ArrayExample1 {
	public static void main (String[] args) {
		int[] arrays = new int[5]; // int형 크기가 5인 배열 선언
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.println(arrays[0]);
		System.out.println(arrays[1]);
		System.out.println(arrays[2]);
		System.out.println(arrays[3]);
		System.out.println(arrays[4]);
		
		int maxValue = 0;
			for(int i=0; i<arrays.length; i++) {
				if(arrays[i] > maxValue) {
					maxValue = arrays[i];
				}
		}
			System.out.println("최대값 : " + maxValue);
	}
}

