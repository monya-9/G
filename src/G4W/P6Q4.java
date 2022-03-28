package G4W;

import java.util.Scanner;

public class P6Q4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;

		System.out.print("정수를 입력하시오: ");
		a = in.nextInt();

		System.out.print("정수를 입력하시오: ");
		b = in.nextInt();

		System.out.print("정수를 입력하시오: ");
		c = in.nextInt();

		if (a < b && a < c) {
			System.out.println("가장 작은 값은 " + a);
		} else if (b < a && b < c) {
			System.out.println("가장 작은 값은 " + b);
		} else {
			System.out.println("가장 작은 값은 " + c);
		}
	}
}
