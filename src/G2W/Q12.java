package G2W;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�� ���� ������ �Է����ּ���: ");
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
		System.out.println(a + "���� " + b + "���� ����: " + sum);
	}
}
