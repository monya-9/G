package G7W;

import java.util.Scanner;

public class Star9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inputNumber;

		System.out.print("높이 입력 : ");
		inputNumber = in.nextInt();

		for (int i = 0; i < inputNumber; i++) {
			for (int j = 0; j < inputNumber; j++) {
				if (j==0 || j== inputNumber-1 || i==0 || i==inputNumber-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
