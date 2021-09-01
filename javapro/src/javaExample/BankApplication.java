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
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------");
			System.out.print("����> ");
			
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
					System.out.println("�Է��� �߸��Ǿ����ϴ�.");
					break;
			}
		}
		System.out.println("���α׷� ����");
	}
	
	// ���� �����ϱ�
	private static void createAccount() {
		System.out.println("-------------------");
		System.out.println("���»���");
		System.out.println("-------------------");
		
		System.out.print("���� ��ȣ : ");
		String ano = scanner.next();
		System.out.println();
		
		for(int i = 0; i < index; ++i) {
			if(accountArray[index].getAno().equals(ano)) {
				System.out.println("���� ���°� �����մϴ�.");
				return;
			}
		}
		
		System.out.print("���� �� : ");
		String owner = scanner.next();
		System.out.println();
		
		System.out.print("�ʱ� �Աݾ�: ");
		int balance = scanner.nextInt();
		System.out.println();
		
		if(index < 100) {
			accountArray[index] = new Account2(ano, owner, balance);
			index++;
			System.out.println("���°� �����Ǿ����ϴ�.");
		} else {
			System.out.println("�ش� ������´� ������ �Ұ����մϴ�.");
		}
	}
	
	// ���� ��Ϻ���
	private static void accountList() {
		System.out.println("-------------------");
		System.out.println("���¸��");
		System.out.println("-------------------");
		
		for(int i = 0; i < index; ++i) {
			System.out.print(accountArray[i].getAno() + "   " 
					+ accountArray[i].getOwner() + "   "
					+ accountArray[i].getBalance());
			System.out.println();
		}
		System.out.println();
	}
	
	// �����ϱ�
	 private static void deposit() {
		System.out.println("-------------------");
		System.out.println("����");
		System.out.println("-------------------");
		
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.println();
				
		System.out.print("���ݾ� : ");
		int balance = scanner.nextInt();
		System.out.println();
		
		Account2 ac = FindAccount(ano);
		if(ac != null) {
			ac.setBalance(ac.getBalance() + balance);
			System.out.println("������ �����Ǿ����ϴ�.");
		} else {
			System.out.println("���ݿ� �����Ͽ����ϴ�.");
		}
	 }
	 
	 // ����ϱ�
	 private static void withdraw() {
	 	System.out.println("-------------------");
		System.out.println("���");
		System.out.println("-------------------");
		
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.println();
				
		System.out.print("��ݾ� : ");
		int balance = scanner.nextInt();
		System.out.println();
		
		Account2 ac = FindAccount(ano);
		if(ac != null) {
			int condition = (ac.getBalance() - balance) > 0 
					? (ac.getBalance() - balance) : -1;
			
			if(condition == -1) {
				System.out.println("���� �����մϴ�.");
				return;
			}
			
			ac.setBalance(condition);
			System.out.println("����� �����Ǿ����ϴ�.");
		} else {
			System.out.println("��ݿ� �����Ͽ����ϴ�.");
		}
	 }
	 
	 //	 Account �迭���� ano�� ������ Account ��ü ã��
	 private static Account2 FindAccount(String ano) {
		 for(int i = 0; i < index; ++i) {
			 if(accountArray[i].getAno().equals(ano)) {
				 return accountArray[i];
			 }
		 }
		 
		 return null;
	 }
}
