package javaObject;

public class SmartTV implements RemoteControl, Searchable{
	private int volumn;
	
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("SmartTV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV�� ���ϴ�.");
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
		
		System.out.println("���� SmartTV ���� : " + this.volumn);
	}
}
