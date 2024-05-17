package chapter5;

public class Person {
	int age;
	String name;
	int height;
	int weight;
	
	public Person() {
		this(5, "aaa", 100, 40);
		System.out.println("생성자");
	}
	public Person(int age, String name, int height, int weight) {
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public void showInfo() {
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("체중 : " + weight);
	}
	public static void main(String[] args) {
		Person p = new Person(20, "홍길동", 175, 70);
		p.showInfo();
		
		Person p2 = new Person();
		p2.showInfo();
				
	}
}
