package javapro;

public class ArrayEx4 {

	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		scores[0][0] = 10;
		scores[0][1] = 45;
		scores[1][2] = 30;
		for(int i = 0; i < scores.length; ++i) {
			for(int j = 0; j < scores[0].length; ++j) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
	}

}
