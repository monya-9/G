package G4W;

public class P6Q6 {
	public static void main(String[] args) {
		int count = 0;
		
		for (int i = 2; i < 100; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
