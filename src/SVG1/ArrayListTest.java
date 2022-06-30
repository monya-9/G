package SVG1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
//		list.add("MILK");
//		list.add("BREAD");
//		list.add("BUTTER");
//		list.add(1, "APPLE");	//인덱스1에 "APPLE"삽입
//		list.set(2, "GRAPE");	//인덱스2 원소를 "GRAPE"로 대체
//		list.remove(3);			//인덱스3의 원소 삭제
//		
//		for(int i = 0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		list.add("하나");
		list.add("둘");
		list.add("셋");
		list.add("넷");
		
		String s;
		Iterator e = list.iterator();
		while(e.hasNext()) {	//다음 원소가 있으면
			s = (String)e.next();	//다음 원소를 얻음
			System.out.println(s);
		}
	}
}
