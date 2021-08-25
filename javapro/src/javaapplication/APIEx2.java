package javaapplication;

public class APIEx2 {

	public static void main(String[] args) {
//		String str1 = "프로그램 개발 응용";
		// 문자열 3~6까지 가져오기.
//		String subStr1 = str1.substring(3, 7);
//		System.out.println(subStr1);
//		String subStr2 = str1.substring(5);
//		System.out.println(subStr2);
		
//		String ssn = "750412-1234567";
//		
		// 인덱스 가져오기.
//		int index = ssn.indexOf("-");
//		
//		String ssn1 = ssn.substring(0, index + 1) + "*******";
//		
//		System.out.println(ssn1);
		
//		String str1 = "우리모두 파이팅";
//		String newStr1 = str1.trim();
//		System.out.println(newStr1);
//		
//		// 10이 문자화.
//		String str2 = String.valueOf(10);
//		System.out.println(str2);
		String text = "홍길동&김철수,이영희-이영표,반찬호";
		String[] names = text.split("&|,|-");
		System.out.println(names[3].trim());
	}

}
