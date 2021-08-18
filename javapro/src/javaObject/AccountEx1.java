package javaObject;

public class AccountEx1 {

	public static void main(String[] args) {
		try {
			Account younghee = new Account("222-555-99999", "�̿���", 0);
			Account dongkuk = new Account("111-777-66666", "�̵���", 5000);
			dongkuk.deposit(10000);
			younghee.deposit(30000);
			younghee.withdraw(3000);
			accountPrint(younghee);
			accountPrint(dongkuk);
			accountPrint(new Account("555-77-432156", "����ȣ", 5000000));
			
			int amount = younghee.withdraw(50000);
			System.out.println("���� �ݾ� = " + amount);
			accountPrint(younghee);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void accountPrint(Account obj) {
		System.out.println("���� : " + obj.BACKNAME);
		System.out.println("���¹�ȣ : " + obj.accountNo);
		System.out.println("�������̸� : " + obj.ownerName);
		System.out.println("�ܾ� : " + obj.balance);
		System.out.println("===================");
	}
}
