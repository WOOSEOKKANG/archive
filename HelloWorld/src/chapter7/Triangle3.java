package chapter7;

public class Triangle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int row = 5;
			int col = row + (row - 1);
			final int FIRST_COL_IDX = col / 2; // 첫 * 표시할 컬럼 인덱스

			String stars[][] = new String[row][col];
			
			for(int i = 0; i <stars.length; i++) {
				for(int j = 0; j < stars[i].length; j++) {
					stars[i][j] = " ";
					if(j == stars[i].length - 1) {
						stars[i][j] = "\n";
					}
				}
			}
			for(int i = 0;i<stars.length; i++) {
				int colIdx = FIRST_COL_IDX - i;
				boolean isStartNewCol = true;
				
				for(int j = 0; j <= i; j++) {
					if(!isStartNewCol) {
						colIdx += 2;
					}
					stars[i][colIdx] = "*";
					isStartNewCol = false;
				}
				for(int j = i; j > 0; j--) {
					if(!isStartNewCol) {
						colIdx -= 2;
					}
					stars[i][colIdx] = "*";
					isStartNewCol = false;
				}
			}

			// 배열 값 출력
			for(int i = 0; i <stars.length; i++) {
				for(int j = 0; j < stars[i].length; j++) {
					System.out.print(stars[i][j]);					
				}
			}
	}

}
