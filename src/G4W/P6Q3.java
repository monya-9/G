package G4W;

import java.util.Scanner;

public class P6Q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double hei;
		double wei;
		double stan;

		System.out.print("키 입력: ");
		hei = in.nextInt();

		System.out.print("몸무게 입력: ");
		wei = in.nextInt();

		stan = (hei - 100) * 0.9;

		if (wei > stan * 1.1) {
			System.out.println("과체중 입니다");
		}
		else if (wei < stan * 1.1 && wei > stan * 0.9) {
			System.out.println("표준체중 입니다");
		}
		else if (wei < stan * 0.9) {			
			System.out.println("저체중 입니다");
		}
	}
}
