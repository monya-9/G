package SVG1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
//		list.add("MILK");
//		list.add("BREAD");
//		list.add("BUTTER");
//		list.add(1, "APPLE");	//�ε���1�� "APPLE"����
//		list.set(2, "GRAPE");	//�ε���2 ���Ҹ� "GRAPE"�� ��ü
//		list.remove(3);			//�ε���3�� ���� ����
//		
//		for(int i = 0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		list.add("�ϳ�");
		list.add("��");
		list.add("��");
		list.add("��");
		
		String s;
		Iterator e = list.iterator();
		while(e.hasNext()) {	//���� ���Ұ� ������
			s = (String)e.next();	//���� ���Ҹ� ����
			System.out.println(s);
		}
	}
}
