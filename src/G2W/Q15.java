package G2W;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		
		do{
		System.out.println("1. �簢�� \n2. �� \n3. �ﰢ�� \n4. ����");
		System.out.print("�޴��� �����Ͻÿ�: ");
		num = in.nextInt();
		
		switch(num) {
		case 1: System.out.println("1�� �޴��� �����Ͽ����ϴ�.\n"); break;
		case 2: System.out.println("2�� �޴��� �����Ͽ����ϴ�.\n"); break;
		case 3: System.out.println("3�� �޴��� �����Ͽ����ϴ�.\n"); break;
		default : System.out.println("�߸� �����߽��ϴ�. \n");
		}

        } while(num != 4);
		System.out.println("�����մϴ�.");
	}
}
