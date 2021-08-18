package javaObject;

public class Television implements RemoteControl {
	private int volumn;
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volumn > RemoteControl.MAX_VOLUME)
			this.volumn = RemoteControl.MAX_VOLUME;
		else if(volumn < RemoteControl.MIN_VOLUME)
			this.volumn = RemoteControl.MIN_VOLUME;
		else
			this.volumn = volume;
		
		System.out.println("���� TV ���� : " + this.volumn);
	}

}
