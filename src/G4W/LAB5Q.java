package G4W;

import java.util.Scanner;

public class LAB5Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isCapital;
		int citizens;
		int riches;
		
		System.out.print("�����Դϱ�?(����: 1, �����ƴ�: 0)");
		isCapital = (sc.nextInt() == 1) ? true : false;
		System.out.print("�α�(����: ��)");
		citizens = sc.nextInt();
		System.out.print("������ ��(����: ��)");
		riches = sc.nextInt();
		
		boolean isMetro = (isCapital && citizens >= 100) 
				|| (isCapital && riches >= 50);
		
		System.out.println("��Ʈ�������� ����: " + isMetro);
	}
}
