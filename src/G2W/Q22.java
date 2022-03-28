package G2W;

import java.util.Scanner;

public class Q22 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		System.out.print("출력할 별 갯수를 입력해주세요: ");
		int sum = in.nextInt();
		int i = 0;
		String str = "...";
		int skip = 50;

		System.out.println("별 " + sum + "개");
		
		while (true) {
			if (sum <= 0) {
				System.out.print("다시 입력해 주세요: ");
				sum = in.nextInt();
				continue;
			} else if (i < sum && sum <= 50) {
				i++;
				System.out.print("*");
			} else if (i < sum) {
				i++;
				sb.append("*");

			} else if (sum > skip) {
				int num = sum - skip;
				System.out.print(sb.substring(0, 50) + str + "*x" + num);
				break;

			}
		}
	}
}
