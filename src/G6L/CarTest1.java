package G6L;

public class CarTest1 {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(1);

		System.out.println("���� �ڵ����� ������ " + myCar.getColor());
		System.out.println("���� �ڵ����� �ӵ��� " + myCar.getSpeed());
		System.out.println("���� �ڵ����� ����� " + myCar.getGear());
	}

}
