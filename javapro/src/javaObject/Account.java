package javaObject;

// ���� ���� Ŭ����
public class Account {
	// �ʵ�
	final static String backName = "��������";
	String accountNo;	// ���� ��ȣ
	String ownerName;	// ������ �̸�
	int balance;		// �ܾ�
	
	public Account() {}
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// ���� �޼���
//	void �޼����̸�(�Ű�����) {
//		
//	}
	void deposit(int amount) {
		balance += amount;
	}
	// ��� �޼���
	int withdraw(int amount) throws Exception{
		if(balance > amount)
			balance -= amount;
		else {
			throw new Exception("�ܾ��� �����մϴ�.");
		}
		return amount;
	}
}
