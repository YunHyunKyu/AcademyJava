package javaapplication;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ȫ�浿", 88);
		map.put("��ö��", 70);
		map.put("�̿���", 96);
		map.put("ȫ�浿", 90);
		System.out.println("�� �ڷ�� : " + map.size());
		System.out.println(map.get("ȫ�浿"));
		map.remove("��ö��");
		System.out.println("�� �ڷ�� : " + map.size());
	}
}
