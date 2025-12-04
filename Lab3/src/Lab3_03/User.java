package Lab3_03;
import java.util.Scanner;

public class User {
	private String password;
	
	public User(String initialPassword) {
		this.password = initialPassword;
	}
	
	public String getPassword() {
		return password;
	}
			
	public void setPassword(String newPassword) {
		if(newPassword.length() >= 8) {
			this.password = newPassword;
			System.out.println("Password update");
		}else {
			System.out.println("Password is too short");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String initialPassword;
		String newPassword;
		initialPassword = input.nextLine();
		newPassword = input.nextLine();
		
		User u = new User(initialPassword);
		
		u.setPassword(newPassword);
		
		System.out.println(u.getPassword());
		
		input.close();

	}

}
