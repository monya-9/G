package G4W;

import java.util.Scanner;

public class P5Q2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int bint;
		int sint;
		int share;
		int rest;
		
		System.out.print("정수를 입력하시오: ");
		sint = in.nextInt();
		System.out.print("정수를 입력하시오: ");
		bint = in.nextInt();
		
		share = bint/sint;
		rest = bint%sint;
		
		System.out.println(bint + "을 " + sint + "으로 나눈 몫은 " + share + "이고 나머지는 " + rest + "입니다.");
	}
}
