package javaObject;

public class DokdoAccountEx {

	public static void main(String[] args) {
		DokdoAccount chulsu = new DokdoAccount("111-22-55555", "��ö��", 0);
		chulsu.deposit(30000);
		Print(chulsu);
	}
	
	public static void Print(DokdoAccount obj) {
		System.out.println("���� ��ȣ : " + obj.accountNo);
		System.out.println("�̸� : " + obj.ownerName);
		System.out.println("�ݾ� : " + obj.balance);
		System.out.println("����Ʈ : " + obj.point);
	}
}
