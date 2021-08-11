package javaObject;

// 은행 계좌 클래스
public class Account {
	// 필드
	final static String backName = "국민은행";
	String accountNo;	// 계좌 번호
	String ownerName;	// 예금주 이름
	int balance;		// 잔액
	
	public Account() {}
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// 예금 메서드
//	void 메서드이름(매개변수) {
//		
//	}
	void deposit(int amount) {
		balance += amount;
	}
	// 출금 메서드
	int withdraw(int amount) throws Exception{
		if(balance > amount)
			balance -= amount;
		else {
			throw new Exception("잔액이 부족합니다.");
		}
		return amount;
	}
}
