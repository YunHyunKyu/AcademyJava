package javaObject;

public class GoodsStock {
	String goodsCode;	// ��ǰ �ڵ�
	int stockNum;	// ��� ����
	
	
	// ��� ���Ѵ�.
	void addStock(int num) {
		stockNum += num;
	}
	
	// ��� ����.
	int SubtrackStock(int num) {
		if(stockNum < num)
			return 0;
		
		stockNum -= num;
		
		return num;
	}
}
