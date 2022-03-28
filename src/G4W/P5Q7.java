package G4W;

import java.util.Scanner;

public class P5Q7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double p;
		final double s = 3.3058;
		
		System.out.print("평수 입력: ");
		p = in.nextInt();
		
		p*=s;
		
		System.out.println(p+"평방미터 입니다.");
	}
}
