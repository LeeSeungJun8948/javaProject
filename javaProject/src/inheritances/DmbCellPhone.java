package inheritances;

public class DmbCellPhone extends CellPhone {
	// 필드
	int channel;
	
	// 생성자
	
	
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	@Override
	void powerOn() {
		System.out.println("DmbPhone 전원을 켭니다.");
	}
	@Override
	void powerOff() {
		System.out.println("DmbPhone 전원을 끕니다.");
	}
	@Override
	void bell() {
		System.out.println("DmbPhone 벨이 울립니다.");
	}
	@Override
	public String toString() {
		return "DmbCellPhone => model : " + model + " DmbCellphone => color : " + color + " channel : " + channel ;
	}

	
	
	/*public DmbCellPhone(int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	*/
}
