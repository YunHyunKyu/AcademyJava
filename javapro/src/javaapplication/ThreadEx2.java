package javaapplication;

public class ThreadEx2 {

	public static void main(String[] args) {
		SumThread st = new SumThread();
		st.start();
		try {
			st.join(); // 쓰레드가 종료될 때까지 기다려줌.
		} catch(InterruptedException e) {
			st.interrupt();
		}
		System.out.println("1부터 100까지의 합 = " + st.getSum());
		
	}
}
