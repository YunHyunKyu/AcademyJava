package javaObject;

public interface RemoteControl {
	// 상수 필드
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// 디폴트 메서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
		}
		else {
			System.out.println("무음 해체 처리");
		}
	}
	
	// 정적 메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
