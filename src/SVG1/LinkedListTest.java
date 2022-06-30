package SVG1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE");	//인덱스1에 "APPLE"삽입
		list.set(2, "GRAPE");	//인덱스2 원소를 "GRAPE"로 대체
		list.remove(3);			//인덱스3의 원소 삭제
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
