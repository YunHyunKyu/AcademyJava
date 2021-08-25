package javaapplication;

import java.util.Arrays;
import java.util.Comparator;

public class APIEx6 {

	public static void main(String[] args) {
		int scores[] = {78,95,80,88,93};
//		Arrays.sort(scores);
		int temp = 0;
		for(int i = 0; i < scores.length-1; ++i) {
			for(int j = i+1; j < scores.length; ++j) {
				if(scores[i] > scores[j]) {
					temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < scores.length; ++i) {
			System.out.print(scores[i] + " ");
		}		
	}

}
