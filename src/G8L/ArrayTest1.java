package G8L;

import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String[] args) {
		final int STUDENT = 5;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[STUDENT];
		for(int i=0; i<STUDENT; i++) {
			System.out.print("������ �Է��Ͻÿ�: ");
			scores[i] = scan.nextInt();
		}
		for(int i = 0; i <STUDENT; i++) {			
			total += scores[i];
		}
		System.out.println("��� ������ " + total /STUDENT + "�Դϴ�.");
	}
}