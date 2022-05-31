package G12L;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar d = Calendar.getInstance();
		System.out.println(d);
		System.out.println(d.get(Calendar.YEAR)+"³â");
		System.out.println(d.get(Calendar.MONTH)+1 +"¿ù");
		System.out.println(d.get(Calendar.DATE)+"ÀÏ");
		
		d.set(Calendar.HOUR, 12);
		d.set(Calendar.MINUTE, 34);
		d.set(Calendar.SECOND, 0);
		System.out.println(d);
	}
}
