package G13L;

class MyException extends Exception{
	public MyException() {
		super("����� ���� ����");
	}
}

public class ExeptionTest1 {
	public static void main(String[] args) {
		try {
			methodl();
		} catch (MyException e) {
			System.out.println(e.getMessage() + "\nȣ�� ���� ����: ");
			e.printStackTrace();
		}
	}
	
	public static void methodl() throws MyException{
		throw new MyException();
	}
}
