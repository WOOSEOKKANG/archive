package chapter4;

public class WhileExam1 {

	public static void main(String[] args) {
	
		int num = 1;
		int sum = 1;
		
		while(num <= 10) {
			sum *= num;
			num++;
		}
		System.out.println(sum);
	}

}
