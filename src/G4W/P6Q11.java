package G4W;

import java.util.Scanner;

public class P6Q11 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int y;
		int m;
		int d;
		String dw;
		int total_days = 0;

		System.out.print("���� �Է�: ");
		y = in.nextInt();

		System.out.print("�� �Է�: ");
		m = in.nextInt();

		System.out.print("�� �Է�: ");
		d = in.nextInt();

		total_days += (y - 1900) * 365;
		total_days += (y - 1900) / 4;

		if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
			if (d == 1 || d == 2) {
				total_days -= 1;
			}
		}
		switch (m) {
		case 1:
			total_days += d;
			break;
		case 2:
			total_days += d + 31;
			break;
		case 3:
			total_days += d + 59;// 31+28;
			break;
		case 4:
			total_days += d + 90;// 31+28+31;
			break;
		case 5:
			total_days += d + 120;// 31+28+31+30;
			break;
		case 6:
			total_days += d + 151;// 31+28+31+30+31;
			break;
		case 7:
			total_days += d + 181;// 31+28+31+30+31+30;
			break;
		case 8:
			total_days += d + 212;// 31+28+31+30+31+30+31;
			break;
		case 9:
			total_days += d + 243;// 31+28+31+30+31+30+31+31;
			break;
		case 10:
			total_days += d + 273;// 31+28+31+30+31+30+31+31+30;
			break;
		case 11:
			total_days += d + 304;// 31+28+31+30+31+30+31+31+30+31;
			break;
		case 12:
			total_days += d + 334;// 31+28+31+30+31+30+31+31+30+31+30;
			break;
		}

		System.out.print(y + "�� " + m + "�� " + d + "���� ");

		switch (total_days % 7) {
		case 0:
			System.out.println("�Ͽ��� �Դϴ�");
			break;
		case 1:
			System.out.println("������ �Դϴ�");
			break;
		case 2:
			System.out.println("ȭ���� �Դϴ�");
			break;
		case 3:
			System.out.println("������ �Դϴ�");
			break;
		case 4:
			System.out.println("����� �Դϴ�");
			break;
		case 5:
			System.out.println("�ݿ��� �Դϴ�");
			break;
		case 6:
			System.out.println("����� �Դϴ�");
			break;
		default:
			System.out.println("�ٽ� �Է��� �ּ���.");
			break;
		}
	}
}
