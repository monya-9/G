package G12L;

import java.util.StringTokenizer;

public class StringTest {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("will Java change my life?");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
