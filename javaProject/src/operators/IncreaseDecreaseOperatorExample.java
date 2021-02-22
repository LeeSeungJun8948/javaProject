package operators;

public class IncreaseDecreaseOperatorExample {
	public static void main (String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x);
		
		System.out.println("____________________________");
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("____________________________");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("____________________________");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("____________________________");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("____________________________");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}
