package javaapplication;

public class APIEx4 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); // ��ü ����
		sb.append("�츮��� ");
		sb.append("ȭ����");
		
		System.out.println(sb.toString());
		sb.insert(4, " ������");
		System.out.println(sb.toString());
		sb.setCharAt(9, '��');
		System.out.println(sb.toString());
		sb.replace(5, 8, "���ھ���");
		System.out.println(sb.toString());
		sb.delete(5, 10);
		System.out.println(sb.toString());
		System.out.println(sb.length());
		String result = sb.toString();
		System.out.println(result);
	}

}
