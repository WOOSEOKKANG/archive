package chapter4;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 1;
		
		switch(age) {
			case 10:
				System.out.println("10");				
			case 1:
				System.out.println("1");
				break;
			case 5:
				System.out.println("5");
			default:
				System.out.println("age:" + age);				
		}
	}

}
