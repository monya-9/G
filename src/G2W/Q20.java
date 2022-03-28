package G2W;

import java.util.Iterator;
import java.util.Scanner;

public class Q20 {
	public static void main(String[] args) {
		System.out.print("출력할 별 갯수를 입력해주세요: ");
		Scanner in = new Scanner(System.in);
		int sum = in.nextInt();
		
		System.out.println("별 " + sum + "개");
		
		for(int i = 0; i<sum; i++) {
			System.out.print("*");
		}
	}
}
