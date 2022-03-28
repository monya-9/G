package G4W;

import java.util.Scanner;

public class LAB5Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isCapital;
		int citizens;
		int riches;
		
		System.out.print("수도입니까?(수도: 1, 수도아님: 0)");
		isCapital = (sc.nextInt() == 1) ? true : false;
		System.out.print("인구(단위: 만)");
		citizens = sc.nextInt();
		System.out.print("부자의 수(단위: 만)");
		riches = sc.nextInt();
		
		boolean isMetro = (isCapital && citizens >= 100) 
				|| (isCapital && riches >= 50);
		
		System.out.println("메트로폴리스 여부: " + isMetro);
	}
}
