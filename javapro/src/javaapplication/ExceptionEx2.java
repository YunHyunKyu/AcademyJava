package javaapplication;

public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			String strArray[] = {"123", "456", "abc"};
			int num1, num2;
			num1 = Integer.parseInt(strArray[0]);
			num2 = Integer.parseInt(strArray[4]);
			System.out.println(num1 + num2);
		} catch (NumberFormatException e) {
			System.out.println("수치를 변환할 수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 벗어났습니다.");
		} catch(Exception e) {
			System.out.println("개발자에게 문의하세요(...)");
			System.out.println(e.getMessage());
		}
	}
}
