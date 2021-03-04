package Check;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService shop1 = ShopService.getInstance();
		ShopService shop2 = ShopService.getInstance();
		
		if(shop1 == shop2) {
			System.out.println("같은 shopservice 객체 입니다.");
			
		}else {
			System.out.println("다른 shopservice 객체 입니다.");
		}
	}
}
