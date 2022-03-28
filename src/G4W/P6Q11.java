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

		System.out.print("연도 입력: ");
		y = in.nextInt();

		System.out.print("월 입력: ");
		m = in.nextInt();

		System.out.print("일 입력: ");
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

		System.out.print(y + "년 " + m + "월 " + d + "일은 ");

		switch (total_days % 7) {
		case 0:
			System.out.println("일요일 입니다");
			break;
		case 1:
			System.out.println("월요일 입니다");
			break;
		case 2:
			System.out.println("화요일 입니다");
			break;
		case 3:
			System.out.println("수요일 입니다");
			break;
		case 4:
			System.out.println("목요일 입니다");
			break;
		case 5:
			System.out.println("금요일 입니다");
			break;
		case 6:
			System.out.println("토요일 입니다");
			break;
		default:
			System.out.println("다시 입력해 주세요.");
			break;
		}
	}
}
