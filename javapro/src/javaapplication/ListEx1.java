package javaapplication;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(70);
		scores.add(80);
		scores.add(60);
		System.out.println(scores.get(0));
		scores.add(88);
		scores.remove(1);
		
		for(int i = 0; i < scores.size(); ++i) {
			System.out.println(scores.get(i));
		}
	}
}
