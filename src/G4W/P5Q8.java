package G4W;

import java.util.Scanner;

public class P5Q8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double dis = 1.5e8;
		double spe = 3.0e5;
		double sec;
		
		sec = dis/spe;
		System.out.println("태양에서 지구도착까지 시간은 "+sec + "입니다.");
	}
}
