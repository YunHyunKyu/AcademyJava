package javaapplication;

public class ExceptionEx1 {

	public static void main(String[] args) {
//		try {
//			String data = null;
//			System.out.println(data.toString());
//		} catch (NullPointerException e) {
//			System.out.println("객체 참조가 없는 상태입니다.");
//		}
//		
//		try {
//			int nums[] = {10, 20, 30};
//			System.out.println(nums[3]);
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 범위를 초과했습니다.");
//		}
		try {
		String str1 = "123";
		String str2 = "456a";
//		System.out.println(str1 + str2);
		System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
		} catch(NumberFormatException e) {
			System.out.println("수치로 변환할 수 없습니다.");
		}finally { 
			System.out.println("예외 처리 수업입니다.");
		}
	}
}
