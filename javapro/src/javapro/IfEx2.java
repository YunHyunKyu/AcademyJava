package javapro;

public class IfEx2 {

	public static void main(String[] args) {
		int score = 95;
		
		if(90 >= score) {
			System.out.println("A등급입니다.");
		}
		else if(80 >= score) {
			System.out.println("B등급입니다.");
		}
		else if(70 >= score) {
			System.out.println("C등급입니다.");
		}
		else if(60 >= score) {
			System.out.println("D등급입니다.");
		}
		else {
			System.out.println("F등급입니다.");
		}
		
		System.out.println("수고하셨습니다.");
		
		
	}
}
