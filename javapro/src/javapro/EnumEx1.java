package javapro;

import java.util.Calendar;

public class EnumEx1 {

	public static void main(String[] args) {
		Week today  = null;
		Calendar now = Calendar.getInstance();
		int week = now.get(Calendar.DAY_OF_WEEK);
		switch(week) {
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
		}
		System.out.println("오늘 요일 : " + today);
		if(today == Week.SUNDAY) {
			System.out.println("일요일");
		}
		else {
			System.out.println("공부일");
		}
		Week day = Week.SUNDAY;
		String name = day.name(); // 문자형태로 받아옴.
		int ordinal = day.ordinal(); // 메서드 열거형 상수값의 위치를 정수로 반환합니다.
		System.out.println(name);
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.FRIDAY;
		int chai = day1.compareTo(day2); // compareTo메서드는 상대적 위치 차이값을 반환한다.
		int chai2 = day2.compareTo(day1);
		System.out.println(chai);
		System.out.println(chai2);
		
		
//		int year = now.get(Calendar.YEAR);
//		int month = now.get(Calendar.MONTH) + 1;
//		int day = now.get(Calendar.DAY_OF_MONTH);
//		int hour = now.get(Calendar.HOUR);
//		System.out.println("올해는 몇년도 => " + year);
//		System.out.println("현재 월은 => " + month);
//		System.out.println("현재 일은 => " + day);
//		System.out.println("현재 시간은 => " + hour);
	}

}
