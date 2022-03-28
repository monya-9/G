package G4W;

import java.util.Scanner;

public class P4Q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double mile;
		double km;
		
		System.out.print("마일을 입력하시오: ");
		mile = in.nextDouble();
		km = 1.609 * mile;
		
		System.out.println(mile + "마일은 " + km + "킬로미터입니다.");
	}
}
