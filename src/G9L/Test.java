package G9L;

import javax.swing.Spring;

 class Car{
	int speed;
	int gear;
	public String color;
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public void speedDown(int decrement) {
		speed -= decrement;
	}
}

 class SportsCar extends Car{
	boolean turbo;
	
	public void setTurbo(boolean newValue) {
		turbo = newValue;
	}
	
}
public class Test{
	public static void main(String[] args) {
		SportsCar c = new SportsCar();
		c.color = "Red";
		c.speedUp(100);
		c.speedDown(20);
		c.setTurbo(true);
	}
}
