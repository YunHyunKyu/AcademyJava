package javaapplication;

public class GenericEx2 {

	public static void main(String[] args) {
		Container<String, String> con1 = new Container<String, String>();
		con1.set("홍길동", "도적");
		String name = con1.getKey();
		String job = con1.getValue();
		System.out.println(name + "의 직업은 " + job + "입니다.");
		Container<String, Integer> con2 = new Container<String, Integer>();
		con2.set("김철수", 30);
		String name2 = con2.getKey();
		int age = con2.getValue();
		System.out.println(name2 + "의 나이는 " + age + "입니다.");
	}
}
