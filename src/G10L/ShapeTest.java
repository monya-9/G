package G10L;

class Shape2 {
	protected int x, y;

	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rectangle extends Shape2 {
	private int width, height;

	public void draw() {
		System.out.println("Rectangle Draw");
	}
}

class Triangle extends Shape2 {
	private int base, height;

	public void draw() {
		System.out.println("Triangle Draw");
	}
}

class Circle2 extends Shape2 {
	private int radius;

	public void draw() {
		System.out.println("Circle Draw");
	}
}

class Oblong extends Shape2{
	private int width, height;
	
	public void draw() {
		System.out.println("Oblong Draw");
	}
}

public class ShapeTest {
	private static Shape2 arrayOfShapes[];

	public static void main(String[] args) {
		init();
		drawAll();
	}
	
	public static void init() {
		arrayOfShapes = new Shape2[4];
		arrayOfShapes[0] = new Rectangle();
		arrayOfShapes[1] = new Triangle();
		arrayOfShapes[2] = new Circle2();
		arrayOfShapes[3] = new Oblong();
	}
	
	public static void drawAll() {
		for(int i=0; i<arrayOfShapes.length; i++) {
			arrayOfShapes[i].draw();
		}
	}
}
