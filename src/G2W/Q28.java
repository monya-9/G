package G2W;

import java.util.Scanner;

public class Q28 {
	public static void main(String[] args) {

		System.out.print("두자리 정수를 입력 : ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int sum = 0;
		int a = num;
		int i = 0;
		
		System.out.print(num);

		while (a > 0) {
			sum += num % 10;
			num /= 10;
			while (i % 2 != 0) {
				a -= sum;
				num += a;
				sum = 0;
				System.out.print(" " + a);
				break;
			}
			i++;
		}
	}
}
