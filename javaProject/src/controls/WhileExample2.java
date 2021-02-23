package controls;

public class WhileExample2 {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
			while(i<10) {
				while(j<10) {
					System.out.println(i + " X " + j + " = " + (i*j));
					j++;
			}
				j = 1;
				i++;
		}
	}
}
