package javaObject;

public class DokdoAccountEx {

	public static void main(String[] args) {
		DokdoAccount chulsu = new DokdoAccount("111-22-55555", "김철수", 0);
		chulsu.deposit(30000);
		Print(chulsu);
	}
	
	public static void Print(DokdoAccount obj) {
		System.out.println("계좌 번호 : " + obj.accountNo);
		System.out.println("이름 : " + obj.ownerName);
		System.out.println("금액 : " + obj.balance);
		System.out.println("포인트 : " + obj.point);
	}
}
