package G2W;

import java.util.Scanner;

public class Q24 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("������ �Է����ּ���(���� -1): ");
		int sco = in.nextInt();
		int n = 0;
		int odd = 0;
		int even = 0;

		while (sco != -1) {
			System.out.print("������ �Է����ּ���(���� -1): ");
			n++;
			sco = in.nextInt();
			if(sco % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("¦��: " + even + ", Ȧ��: " + odd + ", ��ü: " + n);
	}
}
