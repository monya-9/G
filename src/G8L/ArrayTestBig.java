package G8L;

public class ArrayTestBig {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				for (int k = 0; k < 100; k++) {
					sum++;
				}
				System.out.println(sum);
			}
		}
	}
}
