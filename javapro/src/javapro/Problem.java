package javapro;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		//** 9´Ü **
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("** " + num + "´Ü **");
		
		for(int i = 1; i < 10; ++i) {
			System.out.println(num + "X" + i + " = " + num*i);
		}
		
		sc.close();
	}

}
