package javaapplication;

public class APIEx1 {

	public static void main(String[] args) {
//		String str1 = "안녕하세요";
//		System.out.println(str1.toString());
//		String str2 = new String("우리모두 화이팅");
//		char chval = str2.charAt(5);
//		System.out.println(chval);
//		String str1 = new String("홍길동");
//		String str2 = new String("홍길동");
//		
//		if(str1.equals(str2)) {
//			System.out.println("같은 문자열입니다.");
//		}
//		else {
//			System.out.println("다른 문자열입니다.");
//		}
		
		String str1 = "코로나 박멸";
		int index = str1.indexOf("박멸");
		System.out.println(index);
		String newStr1 = str1.replace("코로나", "corona");
		System.out.println(newStr1);
	}

}
