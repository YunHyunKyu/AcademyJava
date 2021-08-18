package javaObject;

public class RemoteControlEx {

	public static void main(String[] args) {
		Television lgTv = new Television();
		lgTv.turnOn();
		lgTv.setVolume(5);
		lgTv.setMute(true);
		lgTv.setMute(false);
		lgTv.turnOff();
		Audio sonyA = new Audio();
		sonyA.setMute(true);
		RemoteControl rc = new Television();
		RemoteControl.changeBattery();
	}
}
