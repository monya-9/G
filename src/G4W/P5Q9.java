package G4W;

import java.util.Scanner;

public class P5Q9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double p;
		double s;
		double a;

		System.out.print("ũ�� �Է�: ");
		p = in.nextInt();

		System.out.print("���� �Է�: ");
		s = in.nextInt();

		a = p / s;
		System.out.println("�з� ����� " + a + "�Դϴ�.");
	}
}
