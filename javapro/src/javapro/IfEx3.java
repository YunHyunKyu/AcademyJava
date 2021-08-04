package javapro;

public class IfEx3 {

	public static void main(String[] args) {
		// 경로우대 (65세 이상) => 30% 할인
		// 13세 이하 어린이 => 50% 할인
		// 청소년 (14세 ~ 18세) => 20% 할인
		int pay = 10000;
		int age = 28;
		
		if(65 <= age) {
			pay = (int)(pay * 0.7);
		}
		else if(19 <= age) {
			System.out.println("할인요금이 없습니다.");
		}
		else if(14 <= age) {
			pay = (int)(pay * 0.8);
		}
		else if(14 > age) {
			pay = (int)(pay * 0.5);
		}
		
		System.out.println("입장 요금은 " + pay + "입니다.");
	}

}
