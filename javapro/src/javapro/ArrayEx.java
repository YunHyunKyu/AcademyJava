package javapro;

public class ArrayEx {

	public static void main(String[] args) {
		String str1 = "�ȳ�";
		String str2 = "�ȳ�";
		
		if(str1 == str2) {
			System.out.println("���� �ּҸ� �����Ѵ�.");
		}
		else {
			System.out.println("�ٸ� �ּҸ� �����Ѵ�.");
		}

		String str3 = new String("����");
		String str4 = new String("����");
		
		if(str3 == str4) {
			System.out.println("���� �ּҸ� �����Ѵ�.");
		}
		else {
			System.out.println("�ٸ� �ּҸ� �����Ѵ�.");
		}
		
		if(str3.equals(str4)) {
			System.out.println("���� ����");
		}
		else {
			System.out.println("�ٸ� ����");
		}
	}
}
