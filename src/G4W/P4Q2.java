package G4W;

import java.util.Scanner;

public class P4Q2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int money;
		int change;
		int surtax;

		System.out.print("���� ��: ");
		 money = in.nextInt();
		
		System.out.print("��ǰ �Ѿ�: ");
		int price = in.nextInt();

		surtax = (int) (price * 0.10);
		change = money - price;
		
		System.out.println("�ΰ���: " + surtax);
		System.out.println("�ܵ�: " + change);
	}
}
