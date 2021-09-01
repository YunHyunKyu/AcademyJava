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
					tk.beep(); // 스피커로 띵 소리남.
					try {
						Thread.sleep(500); // 1000이 1초;
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
			}
		};
		thread.start();
		
		// run() => 쓰레드가 수행할 일
		// sleep() => 주어진 시간동안 일시 정지
		// yield() => 다른 쓰레드에게 실행 양보
		// join() => 다른 쓰레드의 종료를 기다리는 메서드
		// interrupt => 쓰레드를 종료 상태로
		
		for(int i = 0; i < 5; ++i) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500); // 1000이 1초;
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}

}
