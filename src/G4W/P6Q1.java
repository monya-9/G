package G4W;

import java.util.Scanner;

public class P6Q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;

		System.out.print("������ �Է��Ͻÿ�: ");
		a = in.nextInt();

		System.out.print("������ �Է��Ͻÿ�: ");
		b = in.nextInt();

		System.out.print("������ �Է��Ͻÿ�: ");
		c = in.nextInt();

		if (a < b && a < c) {
			if (b < c) {
				System.out.println(a + " " + b + " " + c);
			} else {
				System.out.println(a + " " + c + " " + b);
			}
		} else if (b < a && b < c) {
			if (a < c) {
				System.out.println(b + " " + a + " " + c);
			} else {
				System.out.println(b + " " + c + " " + a);
			}
		} else {
			if (a < b) {
				System.out.println(c + " " + a + " " + b);
			} else {
				System.out.println(c + " " + b + " " + a);
			}
		}
	}
}
