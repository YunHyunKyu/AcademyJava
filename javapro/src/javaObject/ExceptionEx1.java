package javaObject;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// ���� ó��
		try {
			int num1 = 10;
			int num2 = 0;
			int result;
			result = num1/num2;
			System.out.println("��� ��� = " + result);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
