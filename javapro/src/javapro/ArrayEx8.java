package javapro;

public class ArrayEx8 {

	public static void main(String[] args) {
		int[] scores = {90,80,96,70,88};
		int sum = 0;
//		for(int i = 0; i < scores.length; ++i) {
//			sum += scores[i];
//		}
		
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println("ÃÑÁ¡ : " + sum + " Æò±Õ : " + (float)sum/scores.length);
	}
}
