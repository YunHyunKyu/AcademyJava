package javapro;

public class TypeEx2 {

	public static void main(String[] args) {
		byte num1 = 50;
		int num2 = num1;
		
		//char num3 = num1 // char�� ������ ���� �� ���� ������ �ȵ�.
		int num4 = 541225;
		byte num5 = (byte)num4; // �ѹ���Ʈ�� ¥��(2������ �ٲ㼭 ���).
		System.out.println(num5);
		
		if(num4 < Byte.MIN_VALUE || num4 > Byte.MAX_VALUE) {
			System.out.println("byteŸ������ ��ȯ�� �� �����ϴ�.");
		}
		else {
			num5 = (byte)num4;
			System.out.println(num5);
		}
	}

}
