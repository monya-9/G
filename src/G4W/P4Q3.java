package G4W;

import java.util.Iterator;
import java.util.Scanner;

public class P4Q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double radius;
		double volume;
		
		System.out.print("������ �Է�: ");
		radius = in.nextDouble();
		
		volume = (4*radius*radius*radius)/3;
		
		System.out.println("����: " + volume);
		
	}
}
