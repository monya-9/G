package G2W;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("두 수를 입력하세요(예:14,34): ");
		in = new Scanner(in.next()).useDelimiter(",");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double pl = a+b;
		double mi = a-b;
		double mu = a*b;
		double di = a/b;
		
		in.close();
		
		System.out.println(a + " + "  + b + " = " + String.format("%.1f", pl));
		System.out.println(a + " - "  + b + " = " + String.format("%.1f", mi));
		System.out.println(a + " * "  + b + " = " + String.format("%.1f", mu));
		System.out.println(a + " / "  + b + " = " + String.format("%.1f", di));
	}
}
