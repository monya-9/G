package G4L;

import java.util.Scanner;

public class G4L2 {
	public static void main(String[] args) {
		int inputNumber;
		int cnt = 1;
		int center;

		Scanner scan = new Scanner(System.in);

		System.out.print("높이 입력 : ");
		inputNumber = scan.nextInt();

		center = inputNumber - 1;

		for (int i = 0; i < inputNumber; i++) {
			for (int j = 0; j < inputNumber * 2 - 1; j++) {
				if (j > center - cnt && j < center + cnt)
					System.out.print("*");
				else
					System.out.print(".");
			}
			System.out.println();
			cnt++;
		}

	}
}
