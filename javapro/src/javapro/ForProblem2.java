package javapro;

public class ForProblem2 {

	public static void main(String[] args) {
		// Ȧ, ¦
		int oddSum = 0, evenSum = 0;
		for(int i = 1; i <= 100; ++i) {
			if(i%2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		System.out.println("1???? 100???? Ȧ???? ??=" + oddSum);
		System.out.println("1???? 100???? ¦???? ??=" + evenSum);
	}
}