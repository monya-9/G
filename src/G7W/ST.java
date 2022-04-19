package G7W;

import java.util.Scanner;

public class ST {
	public static void main(String[] args) {
		int inputNumber;
		int cnt = 1;
		int center;

		Scanner scan = new Scanner(System.in);

		System.out.print("높이 입력 : ");
		inputNumber = scan.nextInt();

		center = inputNumber - 1;
//		cnt = inputNumber;
		for (int i = 0; i < inputNumber; i++) {
			for (int j = 0; j < inputNumber * 2 - 1; j++) {
				if ((center - i) == j || (center + i) == j || center == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			cnt++;
		}
		
		
//		Scanner in = new Scanner(System.in);
//		int inputNumber;
//		int cnt;
//
//		System.out.print("높이 입력 : ");
//		inputNumber = in.nextInt();
//
//		cnt = inputNumber / 2;
//
//		for (int i = 0; i < inputNumber; i++) {
//			for (int j = 0; j < inputNumber*2+1; j++) {
//				if ((inputNumber - i) == j || (inputNumber + i) == j || inputNumber - 1 == i) {
//					System.out.print("*");
//				} else {
//					System.out.print(".");
//				}
//			}
//			System.out.println();
//		}

//		Scanner in = new Scanner(System.in);
//		int inputNumber;
//		int cnt;
//		
//		System.out.print("높이 입력 : ");
//		inputNumber = in.nextInt();
//		
//		cnt = inputNumber / 2;
//		
//		for(int i=0; i<inputNumber; i++) {
//			for(int j=0; j<inputNumber; j++) {
//				if(Math.abs((inputNumber-1)-i)==j || j==i) {
//					System.out.print("*");
//				}else {
//					System.out.print(".");
//				}
//			}
//			System.out.println();
//		}

//		 for(int i=0, n=0; i <=10;i++) {
//             for(int j=0; j <= n+(5-n)*2+1; j++) {
//                   System.out.print((j<=n)? " " : "*");
//             }
//             System.out.println();
//             if (i<5) {n++;} else { n--;}
//       }

//		for (int i = 0, j = 0; i < 9; i++) {
//			for (int k = 0; k < (9 - j); k++) {
//				System.out.print((k < j) ? " " : "*");
//			}
//			if (i < 4) {
//				j++;
//			} else {
//				j--;
//			}
//			System.out.println();
//		}

//		int inputNumber;
//		
//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("높이 입력 : ");
//		inputNumber = scan.nextInt();
//		
//		for (int i = 0; i < inputNumber; i++) {
//			for (int j = 0; j < inputNumber; j++) {
//
//				if (Math.abs(10 - j) <= i / 2)
//					System.out.print("*");
//				else
//					System.out.print(".");
//			}
//			System.out.println("");
//		}
	}
}
