package javaObject;

public class GoodsStockEx1 {

	public static void main(String[] args) {
		GoodsStock pen = new GoodsStock();
		pen.goodsCode = "Mo74512";
		pen.stockNum = 100;
		pen.addStock(200);
		int amount = pen.SubtrackStock(30);
		System.out.println("상품코드 : " + pen.goodsCode);
		System.out.println("재고수량 : " + pen.stockNum);
		System.out.println("판매수량 : " + amount);
	}

}
