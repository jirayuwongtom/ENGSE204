package Lab3_02;
import java.util.Scanner;

public class Player {
	private int score;
	
	public Player(int initialScore) {
		this.score = initialScore;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int newScore) {
		this.score = newScore;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int initialScore;
		int newScore;
		
		initialScore = input.nextInt();
		newScore = input.nextInt();
		
		Player p = new Player(initialScore);
		
		p.setScore(newScore);
		System.out.println(p.getScore());
		input.close();

	}

}
