package G13L;

import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		try {
			System.out.println(readString());			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static String readString() throws IOException {
		byte[] buf = new byte[100];
		System.out.print("���ڿ��� �Է��Ͻÿ�: ");
		System.in.read(buf);
		return new String(buf);
	}
}
