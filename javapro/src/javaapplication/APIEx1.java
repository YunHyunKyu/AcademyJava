package javaapplication;

public class APIEx1 {

	public static void main(String[] args) {
//		String str1 = "�ȳ��ϼ���";
//		System.out.println(str1.toString());
//		String str2 = new String("�츮��� ȭ����");
//		char chval = str2.charAt(5);
//		System.out.println(chval);
//		String str1 = new String("ȫ�浿");
//		String str2 = new String("ȫ�浿");
//		
//		if(str1.equals(str2)) {
//			System.out.println("���� ���ڿ��Դϴ�.");
//		}
//		else {
//			System.out.println("�ٸ� ���ڿ��Դϴ�.");
//		}
		
		String str1 = "�ڷγ� �ڸ�";
		int index = str1.indexOf("�ڸ�");
		System.out.println(index);
		String newStr1 = str1.replace("�ڷγ�", "corona");
		System.out.println(newStr1);
	}

}
