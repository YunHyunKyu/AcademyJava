package javaapplication;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class APIEx9 {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh:mm:ss");
		System.out.println(sdf.format(now));
		Calendar now1 = Calendar.getInstance();
		int y = now1.get(Calendar.YEAR);
		int month = now1.get(Calendar.MONTH) + 1;
		int day = now1.get(Calendar.DAY_OF_MONTH);
		int hour = now1.get(Calendar.HOUR);
		System.out.println(y);
		System.out.println(month);
		System.out.println(day);
		if(hour > 12) {
			System.out.println("��ſ� ���ĵǼ���.");
		} else {
			System.out.println("������ ��ħ�Դϴ�.");
		}
	}
}
