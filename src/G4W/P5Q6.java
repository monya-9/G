package G4W;

import java.util.Scanner;

public class P5Q6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int won500;
		int won100;
		int won50;
		int won10;
		int total;
		
		System.out.print("500원의 개수 입력: ");
		won500 = in.nextInt();
		
		System.out.print("100원의 개수 입력: ");
		won100 = in.nextInt();
		
		System.out.print("50원의 개수 입력: ");
		won50 = in.nextInt();
		
		System.out.print("10원의 개수 입력: ");
		won10 = in.nextInt();
		
		won500*=500;
		won100*=100;
		won50*=50;
		won10*=10;
		total = won500+won100+won50+won10;
		
		System.out.println("총 금액은 " + total + "원");
	}
}
