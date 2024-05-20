package chapter6;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("제임스", 5000);
		Student studentThomas = new Student("토마스", 5000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentThomas.takeSubway(subwayGreen);
		studentThomas.showInfo();
		subwayGreen.showInfo();
	}
}
