package G4W;

import java.util.Scanner;

public class P6Q4 {
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
			System.out.println("���� ���� ���� " + a);
		} else if (b < a && b < c) {
			System.out.println("���� ���� ���� " + b);
		} else {
			System.out.println("���� ���� ���� " + c);
		}
	}
}
