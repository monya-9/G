package G7L;
class Car2{
	private String color;
	private int speed;
	private int gear;

	public Car2(String c, int s, int g) { // 생성자가 하나라도 선언되어 있으면
		color = c;						// 디폴트 생성자는 만들어지지 않음
		speed = s;
		gear = g;
	}
}
public class CartTest2 {
public static void main(String[] args) {
	Car c1 = new Car("blue" , 100, 1);
}
}
