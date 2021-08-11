package javaObject;

public class RectangleEx {

	public static void main(String[] args) {
		try {
			Rectangle rect = new Rectangle(20, 30);
			int area = rect.getArea();
			
			rect.setWidth(50);
			
			System.out.println("사각형의 넓이 = " + rect.getWidth());
			System.out.println("사각형의 높이 = " + rect.getHeight());
			System.out.println("사각형의 면적 = " + area);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
