package G12L;

public class autoBoxing {
	public static void main(String[] args) {
		Integer box;
		box = 10;
		System.out.println(box + 1);
		//밑에와 같은 값이 나옴
		//오토박싱으로 위 처럼 써도 무방하다는것
		
//		Integer box;
//		box = new Integer(10);
//		System.out.println(box.intValue() + 1);
	}
}
