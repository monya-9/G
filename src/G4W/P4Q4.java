package G4W;

import java.util.Scanner;

public class P4Q4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double fah;
		double cel;
		
		System.out.print("화씨 온도를 입력해주세요: ");
		fah = in.nextDouble();
		
		cel = (fah - 32)/1.8;
		
		System.out.println("섭씨 " +cel + "도");
		
	}
}
