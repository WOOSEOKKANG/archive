package chapter5;

public class Student {
	int studentID; //학번
	int grade; //학년
	int ad;
	String studentName; //이름
	String adress; // 주소
	final boolean isGlasses = false;
	
	//멤버 함수 --> 메서드
	public void showStudentInfo() {//학생 정보 표시
		System.out.println(studentName + " , " + adress);
	}
	public int getGrade(int studentID) {
		System.out.println("학번 : " + studentID);
		grade = studentID % 10;
		
		System.out.println("학년은 : " + grade);
		return grade;
	}
	
	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		stu1.studentName = "박민수";
		stu1.adress = "서울";
		stu1.showStudentInfo();	
		int grade = stu1.getGrade(25);
		System.out.println("한번더 학년 출력 : " + grade);
		
		stu2.studentName = "이철민";
		stu2.adress = "부산";
		stu2.showStudentInfo();	
		int grade2 = stu2.getGrade(45);
		System.out.println("한번더 학년 출력 : " + grade2);
		
	}


}
