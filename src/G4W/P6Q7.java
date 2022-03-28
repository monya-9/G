package G4W;

public class P6Q7 {
	public static void main(String[] args) {
		int count = 0;
		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				for (int c = 1; c < 100; c++) {
					if (a * a + b * b == c * c) {
						count++;
						System.out.println(a + "^2 + " + b + "^2 = " + c + "^2");
					}
				}
			}
		}
		System.out.println(count + "°³");
	}
}
