package G13L;

class MyException extends Exception{
	public MyException() {
		super("사용자 정의 예외");
	}
}

public class ExeptionTest1 {
	public static void main(String[] args) {
		try {
			methodl();
		} catch (MyException e) {
			System.out.println(e.getMessage() + "\n호출 스택 내용: ");
			e.printStackTrace();
		}
	}
	
	public static void methodl() throws MyException{
		throw new MyException();
	}
}
