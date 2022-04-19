package G8L;

import java.util.Scanner;

public class ArrayTest5 {
	final static int STUDENTS = 5;
	
	public static void main(String[] args) {
		int[] scores = new int[STUDENTS];
		getValues(scores);
		getAverage(scores);
		
	}
	
	private static void getValues(int[] array) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<array.length; i++) {
			System.out.print("������ �Է��Ͻÿ�: ");
			array[i] = scan.nextInt();

		}
	}
	
	private static void getAverage(int[] array) {
		int total = 0;
		for(int i=0; i<array.length; i++) {
			total += array[i];
		}
		System.out.println("��� ������ " + total/array.length + "�Դϴ�.");
	}
}
