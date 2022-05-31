package G12L;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class strTokEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		
		StringTokenizer st = new StringTokenizer(str);
		String[] starr = new String[st.countTokens()];
		

		for(int i=0; i<starr.length; i++) {			
			starr[i] = st.nextToken();
			System.out.println(starr[i]);
		}
	}
}
