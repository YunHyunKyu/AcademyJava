package javapro;

public class Problem3 {

	public static void main(String[] args) {
		// 1���� ������ ���� 3500�� ��������󸶱��� ���ϸ� �ɱ�
		int sum = 0;
		int i = 1;
		while(sum < 3500) {
			sum += i;
			++i;
		}
		
		System.out.println(i-1);
	}

}
