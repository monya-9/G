package G4W;

import java.util.Scanner;

public class P6Q2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str;
		
		System.out.print("������ �ϳ� �Է�: ");
		str = in.next();
		
		switch(str){
		case "A":
		case "a":
		case "E":
		case "e":
		case "I":
		case "i":
		case "O":
		case "o":
		case "U":
		case "u":System.out.println("�����Դϴ�."); break;
		default : System.out.println("���� �Դϴ�."); break;
		}
	}
}
