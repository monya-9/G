package G2W;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("두자리 정수를 입력해주세요(예:14,34): ");
		in = new Scanner(in.next()).useDelimiter(",");
		int a = in.nextInt();
		int b = in.nextInt();
		int pl = a+b;
		int mi = a-b;
		int mu = a*b;
		int di = a/b;
		int re = a%b;
		
		in.close();
		
		System.out.println(a + " + "  + b + " = " + pl);
		System.out.println(a + " - "  + b + " = " + mi);
		System.out.println(a + " * "  + b + " = " + mu);
		System.out.println(a + " / "  + b + " = " + di);
		System.out.println(a + " % "  + b + " = " + re);
		
	}
}
