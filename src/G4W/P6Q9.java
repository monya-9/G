package G4W;

import java.util.Scanner;

public class P6Q9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str;
		int a;
		int b;
		int total;
		
		System.out.print("���� �Է�(+, -, *, /): ");
		str = in.next();
		System.out.print("���� �Է�: ");
		a = in.nextInt();
		System.out.print("���� �Է�: ");
		b = in.nextInt();
		
		if(str.equals("+")) {
			total = a+b;
			System.out.println(total);
		} else if(str.equals("-")) {
			total = a-b;
			System.out.println(total);
		} else if(str.equals("*")) {
			total = a*b;
			System.out.println(total);
		} else if(str.equals("/")) {
			if(b != 0) {
				total = a/b;
				System.out.println(total);
			}
		} else {
			System.out.println("���ڸ� �ٽ� �Է��� �ּ���");
		}
	}
}
