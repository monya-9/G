package SVG1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE");	//�ε���1�� "APPLE"����
		list.set(2, "GRAPE");	//�ε���2 ���Ҹ� "GRAPE"�� ��ü
		list.remove(3);			//�ε���3�� ���� ����
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
