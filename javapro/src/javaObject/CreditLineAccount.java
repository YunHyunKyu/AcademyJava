package javaObject;

// 마이너스 통장, 대출 통장
public class CreditLineAccount extends Account {
	int creditLine;   // 대출 한도
	
	
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	@Override
	int withdraw(int amount) throws Exception {
		if((balance+creditLine) < amount)
			throw new Exception("인출이 불가능합니다.");
			
			balance -= amount;
		
		return amount;
	}
}
