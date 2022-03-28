package G2W;

public class Q30 {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		int k = 10;

			while (i >= 0) {
				if (j < i + 1) {
					j++;
					if (j >= i + 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
						continue;
					}
				}
				if (k > i) {
					k--;
					System.out.print("*");
					continue;

				}

			System.out.println("");
			i--;
			j = 0;
			k = 10;
		}
	}
}
