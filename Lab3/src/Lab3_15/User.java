package Lab3_15;
import java.util.Scanner;

public class User {
	private String username;
	private int failedAttempts;
	private boolean isLocked;
	
	public static int maxAttempts = 3;
	
	public User(String username) {
		this.username = username;
		this.failedAttempts = 0;
		this.isLocked = false;
	}
	
	public String getUsername() {
		return username;
	}
	
	public boolean isLocked() {
		return isLocked;
	}
	
	public int getFailedAttempts() {
		return failedAttempts;
	}
	
	public static void setPolicy(int max) {
		if(max > 0) {
			maxAttempts = max;
			System.out.println("Policy updated");
		}else {
			System.out.println("Invalid policy");
		}
	}
	
	public void login(String password) {
		if(isLocked == true) {
			System.out.println("Account is locked");
			return;
		}
		if(password.equals("pass123")) {
			failedAttempts = 0;
			System.out.println("Login successful");
            return;
		}
		
		failedAttempts++;
		if(failedAttempts >= maxAttempts) {
			isLocked = true;
			System.out.println("Login failed Account locked");
		}else {
			int num = maxAttempts - failedAttempts;
			System.out.println("Login failed " + num + " attempts left");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String username = input.nextLine();
		
		User u = new User(username);
		
		int n = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < n; i++) {
			String command = input.nextLine();
			
			if(command.equals("SET_POLICY")) {
				int newMax = input.nextInt();
				input.nextLine();
				User.setPolicy(newMax);
			}
			else if(command.equals("LOGIN")) {
				String pssword = input.nextLine();
				u.login(pssword);
			}
		}
		input.close();
	}

}
