package G2W;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է����ּ���: ");
		int num = in.nextInt();
		int sum = 0;
		int i = 1;
		
		while(i <= num) {
			sum += i;
			i++;
		}
		
		System.out.println("1����" + num + "���� ����: " + sum);
	}
}
