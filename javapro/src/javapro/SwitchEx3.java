package javapro;

public class SwitchEx3 {

	public static void main(String[] args) {
		char grade = 'A';
		switch(grade) {
			case 'A': {
				System.out.println("VIP");
				System.out.println("20% ����");
				break;
			}
			case 'B': {
				System.out.println("���");
				System.out.println("10% ����");
				break;
			}
			case 'C': {
				System.out.println("�Ϲ�");
				break;
			}
			default: {
				System.out.println("����� �߸��Ǿ����ϴ�.");
			}
			
		}

	}

}
