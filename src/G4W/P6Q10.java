package G4W;

import java.util.Scanner;

public class P6Q10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		long a = 0, b = 1, c;
		int i;

		System.out.print("��� ���ϴ� �ױ��� �Է�: ");
		num = in.nextInt();
		
		for (i = 2; i <= num; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}
}
