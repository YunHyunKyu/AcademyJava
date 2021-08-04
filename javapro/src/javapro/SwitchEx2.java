package javapro;

public class SwitchEx2 {

	public static void main(String[] args) {
		int score = 100;
		
		switch(score/10) {
			case 9: {
				System.out.println("A등급입니다.");
				break;
			}
			case 8: {
				System.out.println("B등급입니다.");
				break;
			}
			case 7: {
				System.out.println("C등급입니다.");
				break;
			}
			case 6: {
				System.out.println("D등급입니다.");
				break;
			}
			default: {
				System.out.println("F등급입니다.");
				break;
			}
		}
		System.out.println("수고하셨습니다.");

	}

}
