package javaapplication;

import java.awt.Toolkit;

public class ThreadEx1 {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				super.run();
				
				Toolkit tk = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; ++i) {
					tk.beep(); // ����Ŀ�� �� �Ҹ���.
					try {
						Thread.sleep(500); // 1000�� 1��;
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
			}
		};
		thread.start();
		
		// run() => �����尡 ������ ��
		// sleep() => �־��� �ð����� �Ͻ� ����
		// yield() => �ٸ� �����忡�� ���� �纸
		// join() => �ٸ� �������� ���Ḧ ��ٸ��� �޼���
		// interrupt => �����带 ���� ���·�
		
		for(int i = 0; i < 5; ++i) {
			System.out.println("��");
			
			try {
				Thread.sleep(500); // 1000�� 1��;
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}

}
