package javaObject;

public interface RemoteControl {
	// ��� �ʵ�
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// �߻� �޼���
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// ����Ʈ �޼���
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó��");
		}
		else {
			System.out.println("���� ��ü ó��");
		}
	}
	
	// ���� �޼���
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
