package G2W;

import java.util.Iterator;
import java.util.Scanner;

public class Q20 {
	public static void main(String[] args) {
		System.out.print("����� �� ������ �Է����ּ���: ");
		Scanner in = new Scanner(System.in);
		int sum = in.nextInt();
		
		System.out.println("�� " + sum + "��");
		
		for(int i = 0; i<sum; i++) {
			System.out.print("*");
		}
	}
}
