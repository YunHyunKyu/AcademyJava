package javaObject;

public class GoodsStockEx1 {

	public static void main(String[] args) {
		GoodsStock pen = new GoodsStock();
		pen.goodsCode = "Mo74512";
		pen.stockNum = 100;
		pen.addStock(200);
		int amount = pen.SubtrackStock(30);
		System.out.println("��ǰ�ڵ� : " + pen.goodsCode);
		System.out.println("������ : " + pen.stockNum);
		System.out.println("�Ǹż��� : " + amount);
	}

}
