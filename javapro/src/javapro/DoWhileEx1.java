package javapro;

import java.util.Scanner;

public class DoWhileEx1 {

	public static void main(String[] args) {
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<=10);

		System.out.println("응원 메세지 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String input;
		do {
			System.out.print(">");
			input=sc.nextLine();
			System.out.println("야구팀에 보내는 응원문자=>" + input);
		}while(input.equals("q"));
		
	}

}
