package javaObject;

public class CreditLineEx {

	public static void main(String[] args) {
		try {
			CreditLineAccount sunDal = new CreditLineAccount("111", "�輱��", 10000, 5000000);
			
			int amount = sunDal.withdraw(3000000);
			System.out.println("����� : " + amount);
			System.out.println("�ܾ� : " + sunDal.balance);
			System.out.println("���̳ʽ� �ѵ� : " + sunDal.creditLine);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
