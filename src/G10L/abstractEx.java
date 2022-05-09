package G10L;

abstract class Shape {
	int x, y;

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void printPoint() {
		System.out.println("x��ǥ: " + this.x + ", y��ǥ: " + this.y);
	}

	public abstract void draw();
};

class Rectngle extends Shape {
	int width, heigt;
	public void draw() {
		System.out.println("�簢�� �׸��� �޼ҵ�");
		move(50, 50);
		printPoint();
	}
};

class Circle extends Shape{
	int radius;
	public void draw() {
		System.out.println("�� �׸��� �޼ҵ�");
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
