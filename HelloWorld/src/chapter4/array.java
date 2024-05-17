package chapter4;

public class array {
	public static void main(String[] args) {
		int a = 0;
		int b[] = new int[10];
		long c[] = new long[5];
		int d[] = {0, 1, 2};
		
		int studentIDs[] = new int[10];
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("b" + i + ":" + b[i]);
		}
		for(int i = 0; i < c.length; i++) {
			System.out.println("c" + i + ":" + c[i]);
		}
	}
}
