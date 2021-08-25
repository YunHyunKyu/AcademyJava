package javaapplication;

import java.util.Arrays;

// ���� Ÿ�� �ʵ�� ������ ����
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
		// ���� ���� ���縦 �ؼ� name�� age�� �����Ѵ�.
		Member cloned = (Member) super.clone(); // Object�� clone() ȣ��
		//scores�� ���� �����Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// ���� ������ Member ��ü�� ����
		return cloned;
	}
	
	// �޼���
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
