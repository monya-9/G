package G4W;

public class P6E5_2 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=10; i<=30; i++) {
			for(int j=0; j<=5; j++) {
				sum += i*j;
			}
		}
		System.out.println(sum);
	}
}
