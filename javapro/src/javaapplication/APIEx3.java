package javaapplication;

public class APIEx3 {

	public static void main(String[] args) {
		int scores[] = { 30, 20 };
		Member chulsu = new Member("cs1234", "��ö��", "ab1111", scores, 22);
		Print(chulsu);
		Member copyChulsu = chulsu.getMember();
		
		if(chulsu == copyChulsu) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���.");
		}
	}
	
	public static void Print(Member member) {
		System.out.println("id : " + member.id);
		System.out.println("�̸� : " + member.name);
		System.out.println("password : " + member.password);
		System.out.println("���� : " + member.age);
	}

}
