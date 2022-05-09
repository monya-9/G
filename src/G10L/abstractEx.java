package G10L;

abstract class Shape {
	int x, y;

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void printPoint() {
		System.out.println("x좌표: " + this.x + ", y좌표: " + this.y);
	}

	public abstract void draw();
};

class Rectngle extends Shape {
	int width, heigt;
	public void draw() {
		System.out.println("사각형 그리기 메소드");
		move(50, 50);
		printPoint();
	}
};

class Circle extends Shape{
	int radius;
	public void draw() {
		System.out.println("원 그리기 메소드");
		move(100, 100);
	}
};

public class abstractEx {
	public static void main(String[] args) {
		Rectngle rec = new Rectngle();
		Circle cir = new Circle();
		
		rec.draw();
//		rec.printPoint();

		cir.draw();
		cir.printPoint();
	}
}
