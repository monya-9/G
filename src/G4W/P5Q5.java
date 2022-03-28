package G4W;

import java.util.Scanner;

public class P5Q5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vol;
		int len;
		int wid;
		int hei;

		System.out.print("길이 입력: ");
		len = in.nextInt();

		System.out.print("넓이 입력: ");
		wid = in.nextInt();

		System.out.print("높이 입력: ");
		hei = in.nextInt();

		vol = len * wid * hei;

		if (vol <= 100 * 100 * 100){
			System.out.println("체적은 " + vol + "입니다.");
		} else {
			System.out.println("초과하였습니다.");
		}

	}
}
