package G9W;

class Shape{
	public Shape() {
		System.out.println("Shape 持失切()");
	}
}

public class Rectanle extends Shape{
	public void Rectangle() {
		
		System.out.println("Rectangle 持失切()");
	}
	public static void main(String[] args) {
		Rectanle r = new Rectanle();
	}
}
