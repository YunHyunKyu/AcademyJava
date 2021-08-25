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
			System.out.println("��ġ�� ��ȯ�� �� �����ϴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� ������ ������ϴ�.");
		} catch(Exception e) {
			System.out.println("�����ڿ��� �����ϼ���(...)");
			System.out.println(e.getMessage());
		}
	}
}
