package G4W;

import java.util.Scanner;

public class P6Q5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x;
		double fx;
		
		System.out.print("x ют╥б: ");
		x = in.nextInt();
		
		if(x<=0) {
			fx = x*x*x-9*2;
			System.out.println(fx);
		} else {
			fx=7*x+2;
			System.out.println(fx);
		}
	}
}
