package javaObject;

public class PhysicalInfo {
	String name;
	int age;
	float height, weight;
	
	public PhysicalInfo() {
		
	}
	
	public PhysicalInfo(String name, int age, float height, float weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// ¸Þ¼­µå
	void update(int age) {
		this.age = age;
	}
	
	void update(int age, float height) {
		this.age = age;
		this.height = height;
	}
	
	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}
