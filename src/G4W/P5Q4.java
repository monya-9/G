package G4W;

import java.util.Scanner;

public class P5Q4 {
	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		int rad;
		int hei;
		double pi = 3.14;
		double vol;
		
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�: ");
		rad = in.nextInt();
		
		System.out.print("������� ������ �Է��Ͻÿ�: ");
		hei = in.nextInt();
		
		vol = rad*rad*pi*hei;
		
		System.out.println("������� ���Ǵ� " + vol +"�Դϴ�.");
	}
}
