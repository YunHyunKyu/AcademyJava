package javaObject;

public class SingletonEx {

	public static void main(String[] args) {
		// Singleton single = new SingletonEx(); // ¾ÈµÊ
		Singleton chulsu = Singleton.getInstance();
		Singleton younghee = Singleton.getInstance();
		
		if(chulsu == younghee) {
			System.out.println("°°Àº °´Ã¼");
		}
		else {
			System.out.println("´Ù¸¥ °´Ã¼");
		}
		
	}

}
