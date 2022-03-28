package G2W;

public class Q31 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;

		while (i < 10) {
			if (j < i + 1) {
				j++;
				System.out.print("*");
				continue;
			}
			System.out.println("");
			i++;
			j = 0;
		}

	}
}
