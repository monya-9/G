package G6L;

import java.util.Scanner;

class DiceGame {
	int diceFace;
	int userGuess;
	int hp = 100;
	int score;

	private void RollDice() {
		diceFace = (int) (Math.random() * 6) + 1;
		System.out.println("������ " + diceFace + "�Դϴ�");
	}

	private int getUserInput(String prompt) {
		System.out.print(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	private void checkUserGuess() {
		if (diceFace == userGuess)
			System.out.println("�¾ҽ��ϴ�");
		else
			System.out.println("Ʋ�Ƚ��ϴ�");
	}

	private void myScore() {
		if (diceFace == userGuess) {
			score += 10;
		} else {
			hp -= 10;
			if (hp <= 0) {
				System.out.println("����� �������� " + score + "�� �Դϴ�.");
				System.out.println("���� ����");
				return;
			}
		}
		System.out.println("����� ������ " + score + ", ����� hp�� " + hp);

	}

	public void startPlaying() {
		while (hp > 0) {
			userGuess = getUserInput("������ �Է��Ͻÿ�: ");
			RollDice();
			checkUserGuess();
			myScore();
		}
	}

}

public class DiceGameTest {
	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		game.startPlaying();
	}
}
