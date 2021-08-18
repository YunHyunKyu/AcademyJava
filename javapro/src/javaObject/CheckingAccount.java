package javaObject;

public class CheckingAccount extends Account {
	String cardNo;
	
	// 생성자
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
//		this.accountNo = accountNo;
//		this.ownerName = ownerName;
//		this.balance = balance;
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	public CheckingAccount() {}
	
	// 체크카드로 결제한다.
	int pay(String cardNo, int amount) throws Exception {
		if(!this.cardNo.equals(cardNo))
			throw new Exception("등록된 카드 번호가 아닙니다.");
		
		return withdraw(amount);
	}
}
