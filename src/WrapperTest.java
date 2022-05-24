
public class WrapperTest {
	public static void main(String[] args) {
		String s1 = Integer.toString(10);
		String s2 = Integer.toString(100000);
		String s3 = Float.toString(3.14f);
		String s4 = Double.toString(3.141592);
		
		int i = Integer.parseInt("10");
		long l = Long.parseLong("100000");
		float f = Float.parseFloat("3.14");
		double d =Double.parseDouble("3.141592");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
	}
}
