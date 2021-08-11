package javaObject;

public class Rectangle {
	private int width, height;
	
	public Rectangle(int width, int height) throws Exception {
		if(width <= 0 || height <= 0)
			throw new Exception("넓이와 높이는 플러스 값이어야 합니다.");
		
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) throws Exception {
		if(width <= 0) {
			throw new Exception("넓이는 플러스 값으로만 세팅할 수 있습니다.");
		}
		this.width = width;
		
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) throws Exception {
		if(height <= 0) {
			throw new Exception("높이는 플러스 값으로만 세팅할 수 있습니다.");
		}
		this.height = height;
	}

	
	// 사각형 면적 구하는 메서드
	int getArea() {
		return width * height;
	}
}
