package G2W;

import java.util.Scanner;

public class Q23 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("원하는 단을 입력해주세요: ");
		int g = in.nextInt();

		for (int i = 1; i <= g; i++) {
			System.out.println(g + " x " + i + " = " + g * i);
		}
	}
}
