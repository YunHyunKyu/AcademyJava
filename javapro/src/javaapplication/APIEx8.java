package javaapplication;

public class APIEx8 {

	public static void main(String[] args) {
//		System.out.println(Math.abs(-5));		// ���밪
//		System.out.println(Math.ceil(-3.14));	// �ø�
//		System.out.println(Math.floor(8.6));
//		System.out.println(Math.round(2.7));
//		System.out.println(Math.random()); // 0 ���� 1���� ����
//		System.out.println(Math.rint(3.5)); // ���� ����� ������ �Ǽ���.
		
		boolean check = true;
		
		int lotto[] = new int[6];
		while(check) {
			check = false;
			for(int i=0; i < lotto.length; ++i) {
				lotto[i] = (int)(Math.random() * 45) + 1;
				
			}
			// 6�� �� ���� ���� �߻��Ǿ����� üũ
			for(int i = 0; i < lotto.length-1; ++i) {
				for(int j = i+1; j < lotto.length; ++j) {
					if(lotto[i] == lotto[j]) {
						check = true;
						break;
					}
				}
				if(check) {
					break;
				}
			}
		}
		for(int i = 0; i < lotto.length; ++i) {
			System.out.println(lotto[i]);
		}
	}

}
