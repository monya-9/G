package G7W;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputNumber;
		int cnt;

		System.out.print("높이 입력 : ");
		inputNumber = scan.nextInt();

		cnt = inputNumber /2;
		for (int i = 0; i < inputNumber; i++) {
			for (int j = 0; j < inputNumber; j++) {
				if (Math.abs(cnt - j)<=i%cnt) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
