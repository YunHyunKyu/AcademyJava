package javaObject;

public class GoodsStock {
	String goodsCode;	// 상품 코드
	int stockNum;	// 재고 수향
	
	
	// 재고를 더한다.
	void addStock(int num) {
		stockNum += num;
	}
	
	// 재고를 뺀다.
	int SubtrackStock(int num) {
		if(stockNum < num)
			return 0;
		
		stockNum -= num;
		
		return num;
	}
}
