package chapter5;

public class Calc {

	public int add(int num1, int num2) {
		int tot = num1 + num2;
		System.out.println("더하기 : " + tot);
		return tot;
	}
	public int sub(int num1, int num2) {
		int tot = num1 - num2;
		System.out.println("빼기 : " + tot);
		return tot;
	}
	public int mul(int num1, int num2) {
		int tot = num1 * num2;
		System.out.println("곱하기 : " + tot);
		return tot;
	}
	public double div(double num1, double num2) {
		double tot = num1 / num2;
		System.out.println("나누기 : " + tot);
		return tot;
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c1 = new Calc();
		c1.add(10,20);
		c1.sub(10,20);
		c1.mul(10,20);
		c1.div(10,20);
	}

}
