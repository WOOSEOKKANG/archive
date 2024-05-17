package chapter2;

public class Variable1 {

	public static void main(String[] args) {
		//		final int level = 10;
//		short s = 32767;
//		int i = 2147483647;
	
		
		float d = 0.02f; 
		float f = 0.001f; 
		double a = d+f;
		
		char c1 = 'A';
		char c2 = '한';
		
		String str = "곤니찌와";
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(String.format("%.3f", a));
		System.out.println(String.format("%.3f", d+f));
		System.out.println(String.format("%s", c1+c2));
		
		System.out.println(str);
		

		
	}

}
