package chapter4;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");

		int num = sc.nextInt();
		if (num % 2 == 1) {
			for (int i = 0; i < num - (i + 2); i++) {
				for (int j = 0; j < num - i - 1; j++) {
					System.out.printf(" ");
				}
				for (int j = 0; j < 2 * i + 1; j++) {
					System.out.printf("*");
				}
				System.out.println();
			}
			for (int i = 1; i < num; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * (num - 1) + 1 - (2 * i); j++) {
					System.out.printf("*");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("홀수만 가능합니다");
		}
	}
}
