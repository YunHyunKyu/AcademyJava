package javaapplication;

public class ThreadEx2 {

	public static void main(String[] args) {
		SumThread st = new SumThread();
		st.start();
		try {
			st.join(); // �����尡 ����� ������ ��ٷ���.
		} catch(InterruptedException e) {
			st.interrupt();
		}
		System.out.println("1���� 100������ �� = " + st.getSum());
		
	}
}
