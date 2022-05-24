package G12L;

public class stringBuffer {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Happiness depends upon ourselves");
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		
		System.out.println(s + ", " + sb);

		
		StringBuffer stb = new StringBuffer("10+20=");
		stb.append(10+20);
		stb.insert(0, "¼ö½Ä ");
		System.out.println(stb);
	}
}
