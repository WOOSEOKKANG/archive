package chapter4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int esum = 0;
		int osum = 0;
		int num = 1;
		
		while(num <= 100) {
			if(num % 2 == 0) {
				esum += num; 				
			}
			else if(num % 2 != 0){
				osum += num;
			}
			++num;
				
		}
		System.out.println(esum);
		System.out.println(osum);
	}

}
