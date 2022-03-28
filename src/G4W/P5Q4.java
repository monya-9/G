package G4W;

import java.util.Scanner;

public class P5Q4 {
	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		int rad;
		int hei;
		double pi = 3.14;
		double vol;
		
		System.out.print("원기둥 밑면의 반지름을 입력하시오: ");
		rad = in.nextInt();
		
		System.out.print("원기둥의 높이을 입력하시오: ");
		hei = in.nextInt();
		
		vol = rad*rad*pi*hei;
		
		System.out.println("원기둥의 부피는 " + vol +"입니다.");
	}
}
