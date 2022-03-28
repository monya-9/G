package G2W;

import java.util.Scanner;

public class Q25 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력해주세요(예:14,32): ");
		in = new Scanner(in.next()).useDelimiter(",");
		int num1 = in.nextInt();
		int num2 = in.nextInt();

		for (int i = 1; i <= 100; i++) {
			if ((i % num1 == 0) && (i % num2 == 0)) {
				System.out.print(i + " ");
			}
		}
	}
}
