package javaExample;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		try {
			account.setBalance(10000);
			System.out.println("ÇöÀç ÀÜ°í : " + account.getBalance());
			
			account.setBalance(-100);
			System.out.println("ÇöÀç ÀÜ°í : " + account.getBalance());
			
			account.setBalance(2000000);
			
			System.out.println("ÇöÀç ÀÜ°í : " + account.getBalance());
			
			account.setBalance(300000);
			System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
