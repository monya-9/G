package G4W;

import java.util.Scanner;

public class P5Q9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double p;
		double s;
		double a;

		System.out.print("크기 입력: ");
		p = in.nextInt();

		System.out.print("넓이 입력: ");
		s = in.nextInt();

		a = p / s;
		System.out.println("압력 세기는 " + a + "입니다.");
	}
}
