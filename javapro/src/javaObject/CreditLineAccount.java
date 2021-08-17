package javaObject;

// ���̳ʽ� ����, ���� ����
public class CreditLineAccount extends Account {
	int creditLine;   // ���� �ѵ�
	
	
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	@Override
	int withdraw(int amount) throws Exception {
		if((balance+creditLine) < amount)
			throw new Exception("������ �Ұ����մϴ�.");
			
			balance -= amount;
		
		return amount;
	}
}
