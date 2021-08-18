package javaObject;

public class AbstractEx1 {

	public static void main(String[] args) {
		Tiger hodol = new Tiger();
		Eagle eagle1 = new Eagle();
		hodol.age = 5;
		eagle1.home = "소나무 둥지";
		hodol.move();
		eagle1.move();
	}

}
