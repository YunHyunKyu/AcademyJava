package javaObject;

public class Television implements RemoteControl {
	private int volumn;
	
	@Override
	public void turnOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
	}

	@Override
	public void setVolume(int volume) {
		if(volumn > RemoteControl.MAX_VOLUME)
			this.volumn = RemoteControl.MAX_VOLUME;
		else if(volumn < RemoteControl.MIN_VOLUME)
			this.volumn = RemoteControl.MIN_VOLUME;
		else
			this.volumn = volume;
		
		System.out.println("ÇöÀç TV º¼·ý : " + this.volumn);
	}

}
