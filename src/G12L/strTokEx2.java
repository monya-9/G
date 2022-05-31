package G12L;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class strTokEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		StringTokenizer st = new StringTokenizer(str);
		String[] starr = new String[st.countTokens()];

		for (int i = 0; i < starr.length; i++) {
			starr[i] = st.nextToken();
//			System.out.println(starr[i]);
		}

		sortArray(starr, 1);
		printArray(starr);
	}

	private static void sortArray(String[] arr, int n) {
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.length() - s2.length();
				} else {
					return s1.compareTo(s2);
				}
			}
		});
	}

	private static void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
