package javaObject;

public class classEx1 {

	public static void main(String[] args) {
		try {
			int amount = 0;
			
			Account acc; 			// 객체 변수 선언
			acc = new Account();	// 인스턴스 객체 생성
			acc.accountNo = "111-222-33333";
			acc.ownerName = "김철수";
			acc.balance = 1000;
			Account  gildong = new Account();
			gildong.accountNo = "111-555-77777";
			gildong.ownerName = "홍길동";
			gildong.balance = 0;
			acc.deposit(5000);
			acc.deposit(10000);
			gildong.deposit(20000);
			amount = gildong.withdraw(5000);
			System.out.println(gildong.accountNo + "의 찾은 금액 : " + amount);
			System.out.println("현재 잔액 : " + gildong.balance);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
