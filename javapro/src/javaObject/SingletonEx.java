package javaObject;

public class SingletonEx {

	public static void main(String[] args) {
		// Singleton single = new SingletonEx(); // �ȵ�
		Singleton chulsu = Singleton.getInstance();
		Singleton younghee = Singleton.getInstance();
		
		if(chulsu == younghee) {
			System.out.println("���� ��ü");
		}
		else {
			System.out.println("�ٸ� ��ü");
		}
		
	}

}
