package G9W;

class Shape{
	public Shape() {
		System.out.println("Shape ������()");
	}
}

public class Rectanle extends Shape{
	public void Rectangle() {
		
		System.out.println("Rectangle ������()");
	}
	public static void main(String[] args) {
		Rectanle r = new Rectanle();
	}
}
