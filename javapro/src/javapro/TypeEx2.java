package javapro;

public class TypeEx2 {

	public static void main(String[] args) {
		byte num1 = 50;
		int num2 = num1;
		
		//char num3 = num1 // char는 음수를 가질 수 없기 때문에 안됨.
		int num4 = 541225;
		byte num5 = (byte)num4; // 한바이트로 짜름(2진수로 바꿔서 계산).
		System.out.println(num5);
		
		if(num4 < Byte.MIN_VALUE || num4 > Byte.MAX_VALUE) {
			System.out.println("byte타입으로 변환할 수 없습니다.");
		}
		else {
			num5 = (byte)num4;
			System.out.println(num5);
		}
	}

}
