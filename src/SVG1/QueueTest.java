package SVG1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {	//큐 테스트
	public static void main(String[] args) throws InterruptedException{
		int time = 10;
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = time; i>=0; i--)
			queue.add(i);
		while(!queue.isEmpty()) {
			System.out.println(queue.remove()+" ");
			Thread.sleep(1000);		//현재의 스레드를 1초간 재운다.
		}
	}
}
