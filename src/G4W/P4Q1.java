package G4W;

import java.util.Scanner;

public class P4Q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double mile;
		double km;
		
		System.out.print("������ �Է��Ͻÿ�: ");
		mile = in.nextDouble();
		km = 1.609 * mile;
		
		System.out.println(mile + "������ " + km + "ų�ι����Դϴ�.");
	}
}
