package javaapplication;

public class APIEx2 {

	public static void main(String[] args) {
//		String str1 = "���α׷� ���� ����";
		// ���ڿ� 3~6���� ��������.
//		String subStr1 = str1.substring(3, 7);
//		System.out.println(subStr1);
//		String subStr2 = str1.substring(5);
//		System.out.println(subStr2);
		
//		String ssn = "750412-1234567";
//		
		// �ε��� ��������.
//		int index = ssn.indexOf("-");
//		
//		String ssn1 = ssn.substring(0, index + 1) + "*******";
//		
//		System.out.println(ssn1);
		
//		String str1 = "�츮��� ������";
//		String newStr1 = str1.trim();
//		System.out.println(newStr1);
//		
//		// 10�� ����ȭ.
//		String str2 = String.valueOf(10);
//		System.out.println(str2);
		String text = "ȫ�浿&��ö��,�̿���-�̿�ǥ,����ȣ";
		String[] names = text.split("&|,|-");
		System.out.println(names[3].trim());
	}

}
