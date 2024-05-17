package chapter4;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		i = sc.nextInt();
		
		for(j = 1; j < 10; j++) {
			if(j > i) break;
			System.out.println(i + "X" + j + "=" + (i * j));			
		}		
	}
}
