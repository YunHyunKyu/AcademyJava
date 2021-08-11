package javapro;

public class EnumEx2 {
	public static void main(String args[]) {
		// valueof메서드는 매개값으로 주어지는 문자열과 동일한 열거 객체를 반환한다.
//         Week weekday = Week.valueOf("SUNDAY"); 
//		System.out.println(weekday);
		if(args.length == 0) {
			System.out.println("매개변수가 없다.");
		}
		else {
			String day = args[0];
			Week weekday = Week.valueOf(day);
			if(weekday == Week.SATURDAY || weekday==Week.SUNDAY) {
				System.out.println("주말이군요");
			}
			else {
				System.out.println("평일이군요");
			}
		}
		
		// values 메서드는 열거 타입의 모든 열거 객체들을 배열로 만들어 반환해 준다.
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}
	}
}
