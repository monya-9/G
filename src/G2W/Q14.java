package G2W;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("������ �Է����ּ���(���� -1): ");
		int sco = in.nextInt();
		int sum=0;
		int n=0;

		while(sco != -1) {
		System.out.print("������ �Է����ּ���(���� -1): ");
		sum += sco;
		n++;
		sco = in.nextInt(); 
		}
		System.out.println("����: "+ sum +", �Է�Ƚ��: "+ n + ", ���: " + String.format("%.2f", (double)sum/n));
	

		
	}
}
