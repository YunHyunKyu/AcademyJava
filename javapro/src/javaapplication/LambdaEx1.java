package javaapplication;

import java.util.Iterator;

public class LambdaEx1 {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("출력 값 = " + (i+1));
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("출력 값 = " + (i+1));
			}
		}).start();
		
		
	}

}
