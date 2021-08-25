package javaapplication;

public class APIEx3 {

	public static void main(String[] args) {
		int scores[] = { 30, 20 };
		Member chulsu = new Member("cs1234", "김철수", "ab1111", scores, 22);
		Print(chulsu);
		Member copyChulsu = chulsu.getMember();
		
		if(chulsu == copyChulsu) {
			System.out.println("같다");
		} else {
			System.out.println("다르다.");
		}
	}
	
	public static void Print(Member member) {
		System.out.println("id : " + member.id);
		System.out.println("이름 : " + member.name);
		System.out.println("password : " + member.password);
		System.out.println("나이 : " + member.age);
	}

}
