package G2W;

public class Q13 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		
		for(int i = 1; i <=100; i++) {
				if(i % 2 == 0) {
					a += i;
				} else {
					b += i;
				}
				c += i;
		}
		System.out.println("Â¦¼öÇÕ: " + a + ", " + "È¦¼öÇÕ: " + b + ", " + "ÀüÃ¼ÇÕ: " + c);
	}
}
