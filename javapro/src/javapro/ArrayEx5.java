package javapro;

public class ArrayEx5 {
	public static void main(String[] args) {
		int[][] magic = new int[5][5];
		int row = 0, col = 0; //row ��, col ��
		int num=1; // �������� �� ��
		
		col = magic[0].length / 2;
		magic[row][col] = num;
		for(num=2; num <= magic.length*magic[0].length; ++num) {
			// �밢�� �̵�.
			row--;
			col++;
			
			if(row < 0 && col==magic[0].length) {
				row+=2; 
				col--;
			}
			//���� �������� ���� ���
			else if(row < 0)
				row = magic.length-1; // ������ ������ �̵�.
			
			//���� ���� X
			else if(col == magic[0].length) { 
				col = 0;
			}
			
			else if(magic[row][col] != 0) {
				row+=2;
				col--;
			}
			
			magic[row][col] = num;
		}
		for(int i = 0 ; i < magic.length; ++i) {
			for(int j = 0; j < magic[0].length; ++j) {
				if(magic[i][j] < 10) {
					System.out.print("0"+ magic[i][j] + " ");
				}
				else {
					System.out.print(magic[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
