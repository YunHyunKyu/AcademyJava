package javaObject;

public class CreditLineEx {

	public static void main(String[] args) {
		try {
			CreditLineAccount sunDal = new CreditLineAccount("111", "김선달", 10000, 5000000);
			
			int amount = sunDal.withdraw(3000000);
			System.out.println("인출액 : " + amount);
			System.out.println("잔액 : " + sunDal.balance);
			System.out.println("마이너스 한도 : " + sunDal.creditLine);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
