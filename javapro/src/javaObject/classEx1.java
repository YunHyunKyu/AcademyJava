package javaObject;

public class classEx1 {

	public static void main(String[] args) {
		try {
			int amount = 0;
			
			Account acc; 			// ��ü ���� ����
			acc = new Account();	// �ν��Ͻ� ��ü ����
			acc.accountNo = "111-222-33333";
			acc.ownerName = "��ö��";
			acc.balance = 1000;
			Account  gildong = new Account();
			gildong.accountNo = "111-555-77777";
			gildong.ownerName = "ȫ�浿";
			gildong.balance = 0;
			acc.deposit(5000);
			acc.deposit(10000);
			gildong.deposit(20000);
			amount = gildong.withdraw(5000);
			System.out.println(gildong.accountNo + "�� ã�� �ݾ� : " + amount);
			System.out.println("���� �ܾ� : " + gildong.balance);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
