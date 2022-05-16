package G10L;

interface RemoteControl {
	void turnOn();

	void turnOff();
}

public class AnonymousClassTest {
	public static void main(String[] args) {
		RemoteControl ac = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("TV TurnOn()");

			}

			@Override
			public void turnOff() {
				System.out.println("TV TurnOff()");

			}
		};
		ac.turnOn();
		ac.turnOff();
	}
}
