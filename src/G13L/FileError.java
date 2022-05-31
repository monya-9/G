package G13L;

import java.io.FileWriter;
import java.io.PrintWriter;

public class FileError {
	private int[] list;
	private static final int SIZE = 10;

	public FileError() {
		list = new int[SIZE];
		for (int i = 0; i < SIZE; i++)
			list[i] = i;
		writeList();
	}

	public void writeList() {
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileWriter("outfile.txe"));
			for (int i = 0; i < SIZE; i++)
				out.print("배열 원소 " + i + "=" + list[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException: ");
		} catch (Exception e) {
			System.err.println("IOException");
		} finally {
			if (out != null)
				out.close();
		}
	}

	public static void main(String[] args) {
		new FileError();
	}
}
