package javaObject;

public class CheckingAccount extends Account {
	String cardNo;
	
	// ������
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
//		this.accountNo = accountNo;
//		this.ownerName = ownerName;
//		this.balance = balance;
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	public CheckingAccount() {}
	
	// üũī��� �����Ѵ�.
	int pay(String cardNo, int amount) throws Exception {
		if(!this.cardNo.equals(cardNo))
			throw new Exception("��ϵ� ī�� ��ȣ�� �ƴմϴ�.");
		
		return withdraw(amount);
	}
}
