package javapro;

import java.util.Scanner;

public class OperationEx7 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("시험 성적 : ");
//		int score = sc.nextInt();
//		char grade = (score>=90)?'A':'B';
//		System.out.println(score+ "점은 " + grade + "등급입니다.");
		
		int num1 = 10;
		int num2 = 20;
		// 결과
		// 두 수중에 큰 수는 20입니다.
		int result = (num1 > num2) ? num1 : num2;
		System.out.println("두 수중에 큰 수는 " + result + "입니다.");
	}

}
