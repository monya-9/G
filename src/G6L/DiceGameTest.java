package G6L;

import java.util.Scanner;

class DiceGame {
	int diceFace;
	int userGuess;
	int hp = 100;
	int score;

	private void RollDice() {
		diceFace = (int) (Math.random() * 6) + 1;
		System.out.println("정답은 " + diceFace + "입니다");
	}

	private int getUserInput(String prompt) {
		System.out.print(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	private void checkUserGuess() {
		if (diceFace == userGuess)
			System.out.println("맞았습니다");
		else
			System.out.println("틀렸습니다");
	}

	private void myScore() {
		if (diceFace == userGuess) {
			score += 10;
		} else {
			hp -= 10;
			if (hp <= 0) {
				System.out.println("당신의 총점수는 " + score + "점 입니다.");
				System.out.println("게임 오버");
				return;
			}
		}
		System.out.println("당신의 점수는 " + score + ", 당신의 hp는 " + hp);

	}

	public void startPlaying() {
		while (hp > 0) {
			userGuess = getUserInput("예상값을 입력하시오: ");
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
