package G4W;

import java.util.Scanner;

public class P5Q10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double AC;
		double AE;
		double BC;
		double DE;
		
		System.out.print("AC �Է�: ");
		AC = in.nextDouble();
		
		System.out.print("AE �Է�: ");
		AE = in.nextDouble();
		
		System.out.print("BC �Է�: ");
		BC = in.nextDouble();
		
		DE = AE*BC/AC;
		
		System.out.println("DE�� " + DE);
	}
}
