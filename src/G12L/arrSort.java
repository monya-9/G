package G12L;

import java.util.Arrays;
import java.util.Random;

public class arrSort {
	public static void main(String[] args) {
		int[] array = new int[100];
		initArray(array);
		printArray(array);

		System.out.println("sorting..");
//		Arrays.sort(array);
		sortArray(array, 1);
		printArray(array);
	}

	private static void initArray(int[] arr) {
		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(101);
		}
	}

	private static void sortArray(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(n == 1) {
					if(arr[i] > arr[j]) {
						int arrTmp = arr[j];
						arr[j] = arr[i];
						arr[i] = arrTmp;
					}					
				} else if(n == 0) {
					if(arr[i] < arr[j]) {
						int arrTmp = arr[j];
						arr[j] = arr[i];
						arr[i] = arrTmp;
					}
				} else {
					System.out.println("0과 1중 입력해주세요.");
				}
			}
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
