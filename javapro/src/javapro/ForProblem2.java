package javapro;

public class ForProblem2 {

	public static void main(String[] args) {
		// È¦, Â¦
		int oddSum = 0, evenSum = 0;
		for(int i = 1; i <= 100; ++i) {
			if(i%2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		System.out.println("1ºÎÅÍ 100±îÁö È¦¼öÀÇ ÇÕ=" + oddSum);
		System.out.println("1ºÎÅÍ 100±îÁö Â¦¼öÀÇ ÇÕ=" + evenSum);
	}
}