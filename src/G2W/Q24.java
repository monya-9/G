package G2W;

import java.util.Scanner;

public class Q24 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("점수를 입력해주세요(종료 -1): ");
		int sco = in.nextInt();
		int n = 0;
		int odd = 0;
		int even = 0;

		while (sco != -1) {
			System.out.print("점수를 입력해주세요(종료 -1): ");
			n++;
			sco = in.nextInt();
			if(sco % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("짝수: " + even + ", 홀수: " + odd + ", 전체: " + n);
	}
}
