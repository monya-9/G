package G7W;

import java.util.Scanner;

public class Star8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inputNumber;
		int center;

		System.out.print("높이 입력 : ");
		inputNumber = in.nextInt();

		center = inputNumber - 1;

		for (int i = 0; i < inputNumber; i++) {
			for (int j = 0; j < inputNumber * 2 - 1; j++) {
				if ((center - i) == j || (center + i) == j || center == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
