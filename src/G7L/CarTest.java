package G7L;

class Car {
	private String color;
	private int speed;
	private int gear;

	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}

	public Car() {
		color = "red";
		speed = 0;
		gear = 1;
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("blue", 100, 0);
		Car c2 = new Car();
	}
}
