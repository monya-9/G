package G7W;

import java.util.Scanner;

public class ST {
	public static void main(String[] args) {
		int inputNumber;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("높이 입력 : ");
		inputNumber = scan.nextInt();
		
		for (int i = 0; i < inputNumber; i++) {
			for (int j = 0; j < inputNumber; j++) {

				if (Math.abs(10 - j) <= i / 2)
					System.out.print("*");
				else
					System.out.print(".");
			}
			System.out.println("");
		}
	}
}
