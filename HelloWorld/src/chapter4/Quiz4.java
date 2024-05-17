package chapter4;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++)
		{
			for (int j = num; j > i; j--) {
				System.out.print(" ");
	        }
	        for (int j = 1; j <= i * 2 + 1; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}

}
