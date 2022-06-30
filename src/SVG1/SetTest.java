package SVG1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
//		HashSet<String> set = new HashSet<String>();	//셋은 순서를 중요치 않음
//		LinkedHashSet<String> set = new LinkedHashSet<String>();	//입력 순서대로 나오게함
		TreeSet<String> set = new TreeSet<String>();	//알바벳 순서대로 나오게함
		
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		
		System.out.println(set);
	}
}
