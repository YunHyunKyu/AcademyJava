package javapro;

public class Problem3 {

	public static void main(String[] args) {
		// 1부터 더해진 합이 3500이 넘으려면얼마까지 더하면 될까
		int sum = 0;
		int i = 1;
		while(sum < 3500) {
			sum += i;
			++i;
		}
		
		System.out.println(i-1);
	}

}
