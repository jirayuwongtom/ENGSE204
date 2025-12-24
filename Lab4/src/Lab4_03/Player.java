package Lab4_03;
import java.util.Scanner;
public class Player {
	private String username;
	private int level;
	
	public Player() {
		this.username = "Guest";
		this.level = 1;
	}
	
	public Player(String username , int level) {
		this.username = username;
		this.level = level;
	}
	
	public void displayProfile() {
		System.out.println("User : " + username + ", Level : " + level);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mode = input.nextInt();
		input.nextLine();
		Player p;
		
		if(mode == 1) {
			p = new Player();
		}else if(mode == 2) {
			String name = input.nextLine();
			int level = input.nextInt();
			p = new Player(name , level);
		}else {
			System.out.println("You can only choose 1 or 2");
			return;
		}
		p.displayProfile();
		input.close();
	}

}
