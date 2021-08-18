package javaObject;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer의 객체의 area() 실행");
		
		return Math.PI * r * r;
	}
}
