package G4W;

import java.util.Scanner;

public class P5Q6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int won500;
		int won100;
		int won50;
		int won10;
		int total;
		
		System.out.print("500���� ���� �Է�: ");
		won500 = in.nextInt();
		
		System.out.print("100���� ���� �Է�: ");
		won100 = in.nextInt();
		
		System.out.print("50���� ���� �Է�: ");
		won50 = in.nextInt();
		
		System.out.print("10���� ���� �Է�: ");
		won10 = in.nextInt();
		
		won500*=500;
		won100*=100;
		won50*=50;
		won10*=10;
		total = won500+won100+won50+won10;
		
		System.out.println("�� �ݾ��� " + total + "��");
	}
}
