package javaapplication;

public class GenericEx2 {

	public static void main(String[] args) {
		Container<String, String> con1 = new Container<String, String>();
		con1.set("ȫ�浿", "����");
		String name = con1.getKey();
		String job = con1.getValue();
		System.out.println(name + "�� ������ " + job + "�Դϴ�.");
		Container<String, Integer> con2 = new Container<String, Integer>();
		con2.set("��ö��", 30);
		String name2 = con2.getKey();
		int age = con2.getValue();
		System.out.println(name2 + "�� ���̴� " + age + "�Դϴ�.");
	}
}
