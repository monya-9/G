package G2W;

public class Q19 {
	public static void main(String[] args) {
		int sum = 0;
		String str = "3";

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.print("(");
				for (int j = 0; j < i; j++) {
					if (j % 3 == 0) {
						System.out.print(str);
						if (j + 3 < i) {
							System.out.print("+");
						}
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
