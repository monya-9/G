package G2W;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		
		do{
		System.out.println("1. 사각형 \n2. 원 \n3. 삼각형 \n4. 종료");
		System.out.print("메뉴를 선택하시오: ");
		num = in.nextInt();
		
		switch(num) {
		case 1: System.out.println("1번 메뉴를 선택하였습니다.\n"); break;
		case 2: System.out.println("2번 메뉴를 선택하였습니다.\n"); break;
		case 3: System.out.println("3번 메뉴를 선택하였습니다.\n"); break;
		default : System.out.println("잘못 선택했습니다. \n");
		}

        } while(num != 4);
		System.out.println("종료합니다.");
	}
}
