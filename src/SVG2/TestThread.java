package SVG2;

class MyRunnable2 implements Runnable {
	String myName;

	public MyRunnable2(String name) {
		myName = name;
	}

	public void run() {
		for (int i = 10; i >= 0; i--)
			System.out.print(myName + i + " ");
	}
}

public class TestThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable2("A"));
		Thread t2 = new Thread(new MyRunnable2("B"));
		Thread t3 = new Thread(new MyRunnable2("C"));
		t1.start();
		t2.start();
		t3.start();
	}
}