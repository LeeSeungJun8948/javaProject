package inheritances;

public class CellPhoneEx2 {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
//		cp = (CellPhone) new DmbCellPhone(); // int = (int) byte
		cp.color = "";
		
		if (cp instanceof DmbCellPhone) {
			DmbCellPhone dp = (DmbCellPhone) cp;
			dp.model = "";
			dp.color = "";
			dp.channel = 15;
			dp.powerOn();
		} else {
			System.out.println("Casting 할 수 없습니다.");
		}
		cp = new DmbCellPhone();
		cp.powerOn();
		cp = new SmartPhone();
		cp.powerOn();
	}
}
