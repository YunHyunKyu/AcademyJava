package javaObject;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// 예외 처리
		try {
			int num1 = 10;
			int num2 = 0;
			int result;
			result = num1/num2;
			System.out.println("계산 결과 = " + result);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
