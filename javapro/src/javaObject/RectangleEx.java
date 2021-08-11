package javaObject;

public class RectangleEx {

	public static void main(String[] args) {
		try {
			Rectangle rect = new Rectangle(20, 30);
			int area = rect.getArea();
			
			rect.setWidth(50);
			
			System.out.println("�簢���� ���� = " + rect.getWidth());
			System.out.println("�簢���� ���� = " + rect.getHeight());
			System.out.println("�簢���� ���� = " + area);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
