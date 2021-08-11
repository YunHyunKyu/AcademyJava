package javapro;

public class EnumEx2 {
	public static void main(String args[]) {
		// valueof�޼���� �Ű������� �־����� ���ڿ��� ������ ���� ��ü�� ��ȯ�Ѵ�.
//         Week weekday = Week.valueOf("SUNDAY"); 
//		System.out.println(weekday);
		if(args.length == 0) {
			System.out.println("�Ű������� ����.");
		}
		else {
			String day = args[0];
			Week weekday = Week.valueOf(day);
			if(weekday == Week.SATURDAY || weekday==Week.SUNDAY) {
				System.out.println("�ָ��̱���");
			}
			else {
				System.out.println("�����̱���");
			}
		}
		
		// values �޼���� ���� Ÿ���� ��� ���� ��ü���� �迭�� ����� ��ȯ�� �ش�.
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}
	}
}
