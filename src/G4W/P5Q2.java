package G4W;

import java.util.Scanner;

public class P5Q2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int bint;
		int sint;
		int share;
		int rest;
		
		System.out.print("������ �Է��Ͻÿ�: ");
		sint = in.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		bint = in.nextInt();
		
		share = bint/sint;
		rest = bint%sint;
		
		System.out.println(bint + "�� " + sint + "���� ���� ���� " + share + "�̰� �������� " + rest + "�Դϴ�.");
	}
}
