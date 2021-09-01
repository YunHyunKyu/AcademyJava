package javaapplication;

public class SumThread extends Thread{
	private int sum = 0;
	
	@Override
	public void run() {
		for(int i = 1; i <= 100; ++i) {
			sum += i;
		}
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public int getSum() {
		return sum;
	}
}
