package G4W;

import java.util.Scanner;

public class P5Q10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double AC;
		double AE;
		double BC;
		double DE;
		
		System.out.print("AC 입력: ");
		AC = in.nextDouble();
		
		System.out.print("AE 입력: ");
		AE = in.nextDouble();
		
		System.out.print("BC 입력: ");
		BC = in.nextDouble();
		
		DE = AE*BC/AC;
		
		System.out.println("DE는 " + DE);
	}
}
