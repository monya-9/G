package G4W;

import java.util.Scanner;

public class P5Q5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vol;
		int len;
		int wid;
		int hei;

		System.out.print("���� �Է�: ");
		len = in.nextInt();

		System.out.print("���� �Է�: ");
		wid = in.nextInt();

		System.out.print("���� �Է�: ");
		hei = in.nextInt();

		vol = len * wid * hei;

		if (vol <= 100 * 100 * 100){
			System.out.println("ü���� " + vol + "�Դϴ�.");
		} else {
			System.out.println("�ʰ��Ͽ����ϴ�.");
		}

	}
}
