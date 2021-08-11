package javapro;

public class ArrayEx3 {

	public static void main(String[] args) {
		int scores[] = {75,85,92,60,77,53,60,99,86,73};
		
		int pass = 0;
		for(int i = 0; i < scores.length; ++i) {
			if(scores[i] >= 80) {
				++pass;
			}
		}
		
		System.out.println("합격자 수 = " + pass);

	}

}
