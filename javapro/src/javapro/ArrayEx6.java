package javapro;

public class ArrayEx6 {
	public static void main(String[] args) {
//		String[] strArray = new String[5];
//		strArray[0] = "È«±æµ¿";
//		strArray[1] = "±èÃ¶¼ö";
//		System.out.println(strArray[1]);
		int num1 = 10;
		int num2 = 20;
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println(num2 + "====" + num1);
	}
}
