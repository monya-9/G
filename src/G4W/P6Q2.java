package G4W;

import java.util.Scanner;

public class P6Q2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str;
		
		System.out.print("영문자 하나 입력: ");
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
		case "u":System.out.println("모음입니다."); break;
		default : System.out.println("자음 입니다."); break;
		}
	}
}
