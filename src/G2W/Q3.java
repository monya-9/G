package G2W;

public class Q3 {
	public static void main(String[] args) {
		double a = 15.8;
		double b = 3.7;
		double pl = a+b;
		double mi = a-b;
		double mu = a*b;
		double di = a/b;
		
		System.out.println(a + " + "  + b + " = " + String.format("%.1f", pl));
		System.out.println(a + " - "  + b + " = " + String.format("%.1f", mi));
		System.out.println(a + " * "  + b + " = " + String.format("%.1f", mu));
		System.out.println(a + " / "  + b + " = " + String.format("%.1f", di));
	}
}
