package javapro;

import java.util.Scanner;

public class SwitchEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("여행지를 선택하세요(1.유렵 2.미주 3.동남아)☞");
		int choice = sc.nextInt();
		switch (choice) {
			case 1: {
				System.out.println("1층 안내데스크로 가세요");
				break;
			}
			case 2: {
				System.out.println("2층 안내데스크로 가세요");
				break;
			}
			case 3: {
				System.out.println("별관 안내데스크로 가세요");
				break;
			}
		}
	}
}
