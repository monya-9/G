package G4W;

import java.util.Scanner;

public class P5Q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("�̸� �Է�: ");
		name = in.next();
		
		System.out.print("���� �Է�:");
		age = in.nextInt();
		
		System.out.println("�̸��� " + name + "�̰� ���̴� " + age +"�� �Դϴ�.");		
	}
}
