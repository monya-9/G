package G2W;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("점수를 입력해주세요(종료 -1): ");
		int sco = in.nextInt();
		int sum=0;
		int n=0;

		while(sco != -1) {
		System.out.print("점수를 입력해주세요(종료 -1): ");
		sum += sco;
		n++;
		sco = in.nextInt(); 
		}
		System.out.println("총점: "+ sum +", 입력횟수: "+ n + ", 평균: " + String.format("%.2f", (double)sum/n));
	

		
	}
}
