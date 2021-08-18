package javaObject;

public class SmartTV implements RemoteControl, Searchable{
	private int volumn;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("SmartTV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV를 끕니다.");
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
		
		System.out.println("현재 SmartTV 볼륨 : " + this.volumn);
	}
}
