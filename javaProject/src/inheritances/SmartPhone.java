package inheritances;

public class SmartPhone extends DmbCellPhone {

	@Override
	void powerOn() {
		System.out.println("스마트폰 전언 킴");
	}

	@Override
	void powerOff() {
		System.out.println("스마트폰 전화끔");
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SmartPhone => model : " + model + " SmartPhone => color : " + color;	}
	
}
