package G4W;

import java.util.Scanner;

public class LAB4Q {
	public static void main(String[] args) {
		double w;
		double h;
		double area;
		double perimeter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ���� �Է� : ");
		w = input.nextDouble();
		
		System.out.print("���� ���� �Է� : ");
		h = input.nextDouble();
		
		area = w * h;
		perimeter = 2 * (w + h);
		
		System.out.println("�簢���� ���� : " + area + ", �簢���� �ѷ� : " + perimeter);
	}
}
