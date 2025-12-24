package Lab4_14;
import java.util.Scanner;

public class ScoreBoard {
	private final String gameName;
	private final int[] scores;
	
	public ScoreBoard(String gameName , int[] score) {
		this.gameName = gameName;
		this.scores = score;
	}
	
	public ScoreBoard(ScoreBoard other) {
		this.gameName = other.gameName;
		this.scores = new int[3];
		this.scores[0] = other.scores[0];
		this.scores[1] = other.scores[1];
		this.scores[2] = other.scores[2];
	}
	
	public void displayScore() {
		System.out.println(gameName + " : " + scores[0] + " , " + scores[1] + " , " + scores[2]);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String gameName = input.nextLine();
		int score1 = input.nextInt();
		int score2 = input.nextInt();
		int score3 = input.nextInt();
		int newValue = input.nextInt();
		int[] originalScores = {score1 , score2 , score3};
		
		ScoreBoard sb1 = new ScoreBoard(gameName , originalScores);
		ScoreBoard sb2 = new ScoreBoard(sb1);
		
		originalScores[0] = newValue;
		sb1.displayScore();
		sb2.displayScore();
		input.close();
	}
}
