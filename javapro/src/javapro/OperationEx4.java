package javapro;

public class OperationEx4 {

	public static void main(String[] args) {
		int amount = 3;
		int price = 1000;
		if(amount >= 10 && price >= 1000) {
			price= (int)(price*0.8);
		}
		int sprice = amount * price;
		System.out.println("판매 금액="+sprice);

	}

}
