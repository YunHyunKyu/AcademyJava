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
		System.out.println("���� ���� : " + today);
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ���");
		}
		else {
			System.out.println("������");
		}
		Week day = Week.SUNDAY;
		String name = day.name(); // �������·� �޾ƿ�.
		int ordinal = day.ordinal(); // �޼��� ������ ������� ��ġ�� ������ ��ȯ�մϴ�.
		System.out.println(name);
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.FRIDAY;
		int chai = day1.compareTo(day2); // compareTo�޼���� ����� ��ġ ���̰��� ��ȯ�Ѵ�.
		int chai2 = day2.compareTo(day1);
		System.out.println(chai);
		System.out.println(chai2);
		
		
//		int year = now.get(Calendar.YEAR);
//		int month = now.get(Calendar.MONTH) + 1;
//		int day = now.get(Calendar.DAY_OF_MONTH);
//		int hour = now.get(Calendar.HOUR);
//		System.out.println("���ش� ��⵵ => " + year);
//		System.out.println("���� ���� => " + month);
//		System.out.println("���� ���� => " + day);
//		System.out.println("���� �ð��� => " + hour);
	}

}
