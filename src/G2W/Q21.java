package G2W;

import java.util.Iterator;
import java.util.Scanner;

public class Q21 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		System.out.print("����� �� ������ �Է����ּ���: ");
		int sum = in.nextInt();
		int i = 0;
		String str = "...";

		System.out.println("�� " + sum + "��");
		
		while (true) {
			if (sum <= 0) {
				System.out.print("�ٽ� �Է��� �ּ���: ");
				sum = in.nextInt();
				continue;
			} else if (i < sum && sum <= 50) {
				i++;
				System.out.print("*");
			} else if (i < sum) {
				i++;
				sb.append("*");

			} else if (sum > 50) {
				System.out.print(sb.substring(0, 50) + str);
				break;

			}
		}

	}
}
