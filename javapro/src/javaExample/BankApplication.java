package javaExample;

import java.util.Scanner;

public class BankApplication {
	private static int index = 0;
	private static Account2[] accountArray = new Account2[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
				case 1:
					createAccount();
				break;
				case 2:
					accountList();
				break;
				case 3:
					deposit();
				break;
				case 4:
					withdraw();
				break;
				case 5:
					run = false;
				break;
				default:
					System.out.println("입력이 잘못되었습니다.");
					break;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	// 계좌 생성하기
	private static void createAccount() {
		System.out.println("-------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------");
		
		System.out.print("계좌 번호 : ");
		String ano = scanner.next();
		System.out.println();
		
		for(int i = 0; i < index; ++i) {
			if(accountArray[index].getAno().equals(ano)) {
				System.out.println("같은 계좌가 존재합니다.");
				return;
			}
		}
		
		System.out.print("계좌 주 : ");
		String owner = scanner.next();
		System.out.println();
		
		System.out.print("초기 입금액: ");
		int balance = scanner.nextInt();
		System.out.println();
		
		if(index < 100) {
			accountArray[index] = new Account2(ano, owner, balance);
			index++;
			System.out.println("계좌가 생성되었습니다.");
		} else {
			System.out.println("해당 은행계좌는 개설이 불가능합니다.");
		}
	}
	
	// 계좌 목록보기
	private static void accountList() {
		System.out.println("-------------------");
		System.out.println("계좌목록");
		System.out.println("-------------------");
		
		for(int i = 0; i < index; ++i) {
			System.out.print(accountArray[i].getAno() + "   " 
					+ accountArray[i].getOwner() + "   "
					+ accountArray[i].getBalance());
			System.out.println();
		}
		System.out.println();
	}
	
	// 예금하기
	 private static void deposit() {
		System.out.println("-------------------");
		System.out.println("예금");
		System.out.println("-------------------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.println();
				
		System.out.print("예금액 : ");
		int balance = scanner.nextInt();
		System.out.println();
		
		Account2 ac = FindAccount(ano);
		if(ac != null) {
			ac.setBalance(ac.getBalance() + balance);
			System.out.println("예금이 성공되었습니다.");
		} else {
			System.out.println("예금에 실패하였습니다.");
		}
	 }
	 
	 // 출금하기
	 private static void withdraw() {
	 	System.out.println("-------------------");
		System.out.println("출금");
		System.out.println("-------------------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.println();
				
		System.out.print("출금액 : ");
		int balance = scanner.nextInt();
		System.out.println();
		
		Account2 ac = FindAccount(ano);
		if(ac != null) {
			int condition = (ac.getBalance() - balance) > 0 
					? (ac.getBalance() - balance) : -1;
			
			if(condition == -1) {
				System.out.println("돈이 부족합니다.");
				return;
			}
			
			ac.setBalance(condition);
			System.out.println("출금이 성공되었습니다.");
		} else {
			System.out.println("출금에 실패하였습니다.");
		}
	 }
	 
	 //	 Account 배열에서 ano와 동일한 Account 객체 찾기
	 private static Account2 FindAccount(String ano) {
		 for(int i = 0; i < index; ++i) {
			 if(accountArray[i].getAno().equals(ano)) {
				 return accountArray[i];
			 }
		 }
		 
		 return null;
	 }
}
