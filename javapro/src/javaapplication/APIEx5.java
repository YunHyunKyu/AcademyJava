package javaapplication;

import java.util.regex.Pattern;

public class APIEx5 {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String tel = "010-777-8989";
		boolean result = Pattern.matches(regExp, tel);
		if(result) {
			System.out.println("올바른 전화번호입니다.");
		} else {
			System.out.println("전화번호 형식이 아닙니다.");
		}
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String email = "chulsu@google.co.kr";
		result = Pattern.matches(regExp, email);
		if(result) {
			System.out.println("올바른 이메일 주소입니다.");
		} else {
			System.out.println("이메일 형식이 아닙니다.");
		}
	}
}
