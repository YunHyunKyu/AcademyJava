package javapro;

import java.util.Scanner;

public class SwitchEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� �����ϼ���(1.���� 2.���� 3.������)��");
		int choice = sc.nextInt();
		switch (choice) {
			case 1: {
				System.out.println("1�� �ȳ�����ũ�� ������");
				break;
			}
			case 2: {
				System.out.println("2�� �ȳ�����ũ�� ������");
				break;
			}
			case 3: {
				System.out.println("���� �ȳ�����ũ�� ������");
				break;
			}
		}
	}
}
