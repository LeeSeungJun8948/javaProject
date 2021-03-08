package interfaces;

public class RemoteControlExe {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		
		
		
		rc = new RemoteControl() {// 익명구현객체. // 이번에 한번 쓰여지고 말거 
			int volume; 
			
			@Override
			public void turnOn() {
			System.out.println("DVD를 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("DVD를 끕니다.");
				
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("DVD 볼륨 " + volume);
			} // 익명구현객체. // 이번에 한번 쓰여지고 말거 
		};
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		}
}
