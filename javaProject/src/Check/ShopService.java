package Check;

public class ShopService {
	private static ShopService shop = new ShopService();
	static ShopService getInstance() {
		return shop;
	}
}
