package javaapplication;

import java.util.Arrays;

// 참조 타입 필드는 번지만 복제
public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int scores[];
	public int age;
	
	public Member(String id, String name, String password, int[] scores, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.scores = scores;
		this.age = age;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복사를 해서 name과 age를 복제한다.
		Member cloned = (Member) super.clone(); // Object의 clone() 호출
		//scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// 깊은 복제된 Member 객체를 리턴
		return cloned;
	}
	
	// 메서드
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member)clone();
		} catch (CloneNotSupportedException e) {
			return cloned;
		}
		
		return cloned;
	}
}
