package javaObject;

public class DokdoAccount extends Account {
	int point = 0;
	
	public DokdoAccount(String accountNo, String ownerName, int balance) {
		super(accountNo, ownerName, balance);
	}
	
	@Override
	void deposit(int amount) {
		super.deposit(amount);
		point += (int)(amount * 0.001);
	}
}
