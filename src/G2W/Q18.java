package G2W;

public class Q18 {
	public static void main(String[] args) {
		int sum = 0;
		String str = "1";

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print("(");
				for (int j = 0; j < i; j++) {
					System.out.print(str);
					if (j + 1 < i) {
						System.out.print("+");
					}
				}
				System.out.print(")");

				if (i == 9) {
					System.out.print("=");
				} else {
					System.out.print("+");
				}
				sum += i;
			}
		}
		System.out.print(sum);

	}
}
