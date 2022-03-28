package G4W;

import java.util.Scanner;

public class P5Q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cm;
		int ft;
		double inch;

		System.out.print("키를 입력하시오: ");
		cm = in.nextInt();
		inch = cm / 2.54;
		ft = (int) inch / 12;
		inch = inch - ft * 12;

		System.out.println(cm + "cm는 " + ft + "피트 " + inch + "인치입니다.");

	}
}
