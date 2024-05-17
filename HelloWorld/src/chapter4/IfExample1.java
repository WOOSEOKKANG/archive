package chapter4;
import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int age;
		int basicticket = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		

		if (age >= 20 ) {
			basicticket += 1000;
		}
		if (age > 40  ) {
			basicticket += 1000;
		}
		if (age >= 65){
			basicticket *= 0.8;
		}
		System.out.println("입장료는" + basicticket + "입니다");				
	}

}
