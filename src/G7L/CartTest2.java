package G7L;
class Car2{
	private String color;
	private int speed;
	private int gear;

	public Car2(String c, int s, int g) { // �����ڰ� �ϳ��� ����Ǿ� ������
		color = c;						// ����Ʈ �����ڴ� ��������� ����
		speed = s;
		gear = g;
	}
}
public class CartTest2 {
public static void main(String[] args) {
	Car c1 = new Car("blue" , 100, 1);
}
}
