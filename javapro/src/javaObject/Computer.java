package javaObject;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer�� ��ü�� area() ����");
		
		return Math.PI * r * r;
	}
}
