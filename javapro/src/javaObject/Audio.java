package javaObject;

public class Audio implements RemoteControl {
	private int volumn;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("������� �մϴ�");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("������� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volumn > RemoteControl.MAX_VOLUME)
			this.volumn = RemoteControl.MAX_VOLUME;
		else if(volumn < RemoteControl.MIN_VOLUME)
			this.volumn = RemoteControl.MIN_VOLUME;
		else
			this.volumn = volume;
		
		System.out.println("���� Audio ���� : " + this.volumn);
	}

}
