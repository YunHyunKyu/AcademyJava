package javaObject;

public class PhysicalInfoEx1 {

	public static void main(String[] args) {
		PhysicalInfo hyoju = new PhysicalInfo("김효주", 10, 130.2f, 35.0f);
		hyoju.update(11, 145.0f, 45.0f);
		printPhysicalInfo(hyoju);
		hyoju.update(12, 157.0f);
		printPhysicalInfo(hyoju);
		hyoju.update(13);
		printPhysicalInfo(hyoju);
	}
	
	public static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("이름 : " + obj.name);
		System.out.println("나이 : " + obj.age);
		System.out.println("키 : " + obj.height);
		System.out.println("몸무게 : " + obj.weight);
		System.out.println("=================");
	}

}
