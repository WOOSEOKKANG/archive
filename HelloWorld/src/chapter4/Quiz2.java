package chapter4;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if (i % 2 != 0) {
					continue;
				}
				System.out.println(i + "X" + j + "=" + (i * j));
			}
		}
	}

}
