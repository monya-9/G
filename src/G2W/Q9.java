package G2W;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = in.nextInt();
		int n = 0;
		
		for(int i = 1; i<=num; i++) {
			if(i % 2 != 0) {
				n += i;
			}
			
			
		}
		System.out.println("1부터 " + num + "까지 홀수 합: " + n);
	}
}
