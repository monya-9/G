package G2W;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력해주세요: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int sum = 0;
		
		if(a > b) {
			int t = a;
			a = b;
			b = t;
				
		}
		
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(a + "부터 " + b + "까지 합은: " + sum);
	}
}
