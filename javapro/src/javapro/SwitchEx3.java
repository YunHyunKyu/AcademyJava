package javapro;

public class SwitchEx3 {

	public static void main(String[] args) {
		char grade = 'A';
		switch(grade) {
			case 'A': {
				System.out.println("VIP");
				System.out.println("20% 할인");
				break;
			}
			case 'B': {
				System.out.println("우수");
				System.out.println("10% 할인");
				break;
			}
			case 'C': {
				System.out.println("일반");
				break;
			}
			default: {
				System.out.println("등급이 잘못되었습니다.");
			}
			
		}

	}

}
