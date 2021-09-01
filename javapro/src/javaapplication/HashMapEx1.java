package javaapplication;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("È«±æµ¿", 88);
		map.put("±èÃ¶¼ö", 70);
		map.put("ÀÌ¿µÈñ", 96);
		map.put("È«±æµ¿", 90);
		System.out.println("ÃÑ ÀÚ·á¼ö : " + map.size());
		System.out.println(map.get("È«±æµ¿"));
		map.remove("±èÃ¶¼ö");
		System.out.println("ÃÑ ÀÚ·á¼ö : " + map.size());
	}
}
