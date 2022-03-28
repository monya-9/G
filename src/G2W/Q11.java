package G2W;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = in.nextInt();
		int sum = 0;
		int i = 1;
		
		while(i <= num) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터" + num + "까지 합은: " + sum);
	}
}
