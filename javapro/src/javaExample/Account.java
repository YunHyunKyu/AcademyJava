package javaExample;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private int balance;
	
	public Account() {
		
	}
	
	public void setBalance(int balance) throws Exception {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
			this.balance = balance;
		else
			throw new Exception("���� ������ �ʰ��Ͽ����ϴ�.");
	}
	
	public int getBalance() {
		return balance;
	}
}
