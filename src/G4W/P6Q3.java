package G4W;

import java.util.Scanner;

public class P6Q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double hei;
		double wei;
		double stan;

		System.out.print("Ű �Է�: ");
		hei = in.nextInt();

		System.out.print("������ �Է�: ");
		wei = in.nextInt();

		stan = (hei - 100) * 0.9;

		if (wei > stan * 1.1) {
			System.out.println("��ü�� �Դϴ�");
		}
		else if (wei < stan * 1.1 && wei > stan * 0.9) {
			System.out.println("ǥ��ü�� �Դϴ�");
		}
		else if (wei < stan * 0.9) {			
			System.out.println("��ü�� �Դϴ�");
		}
	}
}
