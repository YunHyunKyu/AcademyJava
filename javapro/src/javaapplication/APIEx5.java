package javaapplication;

import java.util.regex.Pattern;

public class APIEx5 {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String tel = "010-777-8989";
		boolean result = Pattern.matches(regExp, tel);
		if(result) {
			System.out.println("�ùٸ� ��ȭ��ȣ�Դϴ�.");
		} else {
			System.out.println("��ȭ��ȣ ������ �ƴմϴ�.");
		}
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String email = "chulsu@google.co.kr";
		result = Pattern.matches(regExp, email);
		if(result) {
			System.out.println("�ùٸ� �̸��� �ּ��Դϴ�.");
		} else {
			System.out.println("�̸��� ������ �ƴմϴ�.");
		}
	}
}
