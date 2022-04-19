package G7W;

import java.util.Scanner;

public class Star2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inputNumber;
		int cnt;

		System.out.print("높이 입력 : ");
		inputNumber = in.nextInt();

		cnt = inputNumber / 2;

		for (int i = 0; i < inputNumber; i++) {
			for (int j = 0; j < inputNumber; j++) {
				if (Math.abs(cnt - j) <= i / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
