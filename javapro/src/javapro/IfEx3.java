package javapro;

public class IfEx3 {

	public static void main(String[] args) {
		// ��ο�� (65�� �̻�) => 30% ����
		// 13�� ���� ��� => 50% ����
		// û�ҳ� (14�� ~ 18��) => 20% ����
		int pay = 10000;
		int age = 28;
		
		if(65 <= age) {
			pay = (int)(pay * 0.7);
		}
		else if(19 <= age) {
			System.out.println("���ο���� �����ϴ�.");
		}
		else if(14 <= age) {
			pay = (int)(pay * 0.8);
		}
		else if(14 > age) {
			pay = (int)(pay * 0.5);
		}
		
		System.out.println("���� ����� " + pay + "�Դϴ�.");
	}

}
