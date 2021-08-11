package javaObject;

public class Rectangle {
	private int width, height;
	
	public Rectangle(int width, int height) throws Exception {
		if(width <= 0 || height <= 0)
			throw new Exception("���̿� ���̴� �÷��� ���̾�� �մϴ�.");
		
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) throws Exception {
		if(width <= 0) {
			throw new Exception("���̴� �÷��� �����θ� ������ �� �ֽ��ϴ�.");
		}
		this.width = width;
		
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) throws Exception {
		if(height <= 0) {
			throw new Exception("���̴� �÷��� �����θ� ������ �� �ֽ��ϴ�.");
		}
		this.height = height;
	}

	
	// �簢�� ���� ���ϴ� �޼���
	int getArea() {
		return width * height;
	}
}
