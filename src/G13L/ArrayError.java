package G13L;

public class ArrayError {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int i = 0;
		try {
			for (i = 0; i <= array.length; i++) {
				System.out.print(array[i] + " ");
			}
		} catch (Exception e) {
			System.out.println("�ε���" + i + "�� ����� �� �����ϴ�.");
		}
	}
}