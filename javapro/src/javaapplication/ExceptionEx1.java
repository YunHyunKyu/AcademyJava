package javaapplication;

public class ExceptionEx1 {

	public static void main(String[] args) {
//		try {
//			String data = null;
//			System.out.println(data.toString());
//		} catch (NullPointerException e) {
//			System.out.println("��ü ������ ���� �����Դϴ�.");
//		}
//		
//		try {
//			int nums[] = {10, 20, 30};
//			System.out.println(nums[3]);
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("�ε��� ������ �ʰ��߽��ϴ�.");
//		}
		try {
		String str1 = "123";
		String str2 = "456a";
//		System.out.println(str1 + str2);
		System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
		} catch(NumberFormatException e) {
			System.out.println("��ġ�� ��ȯ�� �� �����ϴ�.");
		}finally { 
			System.out.println("���� ó�� �����Դϴ�.");
		}
	}
}
