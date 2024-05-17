package chapter4;

public class Triangle2 {
	/*
	 * 
	 * 클래스 주석 2차원 배열 클래스
	 * 
	 * @author Kang
	 * 
	 * @since 2024. 5. 14
	 * 
	 * @ver 1.0
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][3];

		a[0][2] = 100;
		a[1][1] = 200;
		a[2][0] = 300;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("cc["+i+"]" + "["+j+"] = " + a[i][j]);
			}
		}

	}

}
