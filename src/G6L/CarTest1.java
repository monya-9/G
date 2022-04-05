package G6L;

public class CarTest1 {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(1);

		System.out.println("현재 자동차의 색상은 " + myCar.getColor());
		System.out.println("현재 자동차의 속도은 " + myCar.getSpeed());
		System.out.println("현재 자동차의 기어은 " + myCar.getGear());
	}

}
