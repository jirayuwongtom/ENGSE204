package Lab3_01;
import java.util.Scanner;

public class User {
	private String username;
	
	public User (String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name;
		name = input.nextLine();
		
		User u = new User(name);
		
		System.out.println(u.getUsername());
		input.close();
	}
}
