package javapro;

import java.util.Scanner;

public class DoWhileEx1 {

	public static void main(String[] args) {
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<=10);

		System.out.println("���� �޼��� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		String input;
		do {
			System.out.print(">");
			input=sc.nextLine();
			System.out.println("�߱����� ������ ��������=>" + input);
		}while(input.equals("q"));
		
	}

}
