package Lab3_09;

public class User {
	private String username;
	private String password;
	
	private static int minPasswordLength = 8;
	
	public User(String username , String password) {
		this.username = username;
		if(password.length() >= minPasswordLength) {
			this.password = password;
			System.out.println("Creation successful");
		}else {
			this.password = "invalid";
			System.out.println("Creation failed");
		}
		
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String newPassword) {
		if(newPassword.length() >= minPasswordLength) {
			this.password = newPassword;
			System.out.println("Update successful");
		}else {
			System.out.println("Update failed");
		}
	}
	
	public static void setMinLength(int length) {
		if(length < 4) {
			System.out.println("Invalid length");
		}else {
			minPasswordLength = length;
			System.out.println("New min length set to " + length);
		}
	}
	
	public static int getMinLength() {
		return minPasswordLength;
	}

}
