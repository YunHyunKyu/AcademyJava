package javaObject;

public class CheckEx1 {
	public static void main(String args[]) {
		try {
			CheckingAccount chulsu = new CheckingAccount("111-22-7777", "±èÃ¶¼ö",
					1000, "1111-2222-3333-4444");
			
			chulsu.deposit(50000);
			
			int paidAmount = chulsu.pay("1111-2222-3333-4444", 20000);
			System.out.println("ÁöºÒ¾× : " + paidAmount);
			System.out.println("ÇöÀç ÀÜ¾× : " + chulsu.balance);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
