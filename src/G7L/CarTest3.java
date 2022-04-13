package G7L;

class Car3 {
	private String color;
	private int speed;
	private int gear;

	private int id;

	private static int numberOfCars = 0;

	public Car3(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;

		id = ++numberOfCars;
	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}
	
	public String toString() {
		return String.format("색상: %s, 속도: %d, 기어: %d", color, speed, gear);
	}

}

public class CarTest3 {
	public static void main(String[] args) {
		Car c1 = new Car("blue", 100, 1);
		Car c2 = new Car("white", 0, 1);
		int n = Car3.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차 수 = " + n);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
