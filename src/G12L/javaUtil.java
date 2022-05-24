package G12L;

import java.util.Random;

public class javaUtil {
	public static void main(String[] args) {
		Random random = new Random();
		for(int i =0; i<10; i++) {
			System.out.println(random.nextInt(100));
		}
	}
}
