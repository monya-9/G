package G4W;

import java.util.Scanner;

public class LAB4Q {
	public static void main(String[] args) {
		double w;
		double h;
		double area;
		double perimeter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("가로 길이 입력 : ");
		w = input.nextDouble();
		
		System.out.print("세로 길이 입력 : ");
		h = input.nextDouble();
		
		area = w * h;
		perimeter = 2 * (w + h);
		
		System.out.println("사각형의 넓이 : " + area + ", 사각형의 둘레 : " + perimeter);
	}
}
