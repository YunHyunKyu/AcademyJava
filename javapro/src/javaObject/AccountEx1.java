package javaObject;

public class AccountEx1 {

	public static void main(String[] args) {
		try {
			Account younghee = new Account("222-555-99999", "이영희", 0);
			Account dongkuk = new Account("111-777-66666", "이동국", 5000);
			dongkuk.deposit(10000);
			younghee.deposit(30000);
			younghee.withdraw(3000);
			accountPrint(younghee);
			accountPrint(dongkuk);
			accountPrint(new Account("555-77-432156", "박찬호", 5000000));
			
			int amount = younghee.withdraw(50000);
			System.out.println("인출 금액 = " + amount);
			accountPrint(younghee);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void accountPrint(Account obj) {
		System.out.println("은행 : " + obj.BACKNAME);
		System.out.println("계좌번호 : " + obj.accountNo);
		System.out.println("예금주이름 : " + obj.ownerName);
		System.out.println("잔액 : " + obj.balance);
		System.out.println("===================");
	}
}
