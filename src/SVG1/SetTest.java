package SVG1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
//		HashSet<String> set = new HashSet<String>();	//���� ������ �߿�ġ ����
//		LinkedHashSet<String> set = new LinkedHashSet<String>();	//�Է� ������� ��������
		TreeSet<String> set = new TreeSet<String>();	//�˹ٺ� ������� ��������
		
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		
		System.out.println(set);
	}
}
