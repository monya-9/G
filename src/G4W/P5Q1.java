package G4W;

import java.util.Scanner;

public class P5Q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("이름 입력: ");
		name = in.next();
		
		System.out.print("나이 입력:");
		age = in.nextInt();
		
		System.out.println("이름은 " + name + "이고 나이는 " + age +"세 입니다.");		
	}
}
