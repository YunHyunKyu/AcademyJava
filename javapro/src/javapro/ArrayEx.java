package javapro;

public class ArrayEx {

	public static void main(String[] args) {
		String str1 = "안녕";
		String str2 = "안녕";
		
		if(str1 == str2) {
			System.out.println("같은 주소를 참조한다.");
		}
		else {
			System.out.println("다른 주소를 참조한다.");
		}

		String str3 = new String("하잉");
		String str4 = new String("하잉");
		
		if(str3 == str4) {
			System.out.println("같은 주소를 참조한다.");
		}
		else {
			System.out.println("다른 주소를 참조한다.");
		}
		
		if(str3.equals(str4)) {
			System.out.println("같은 문자");
		}
		else {
			System.out.println("다른 문자");
		}
	}
}
