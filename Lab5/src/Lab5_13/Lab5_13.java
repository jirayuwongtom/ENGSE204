package Lab5_13;
import java.util.Scanner;

class User {
	protected String name;
	public User(String name) {
		this.name = name;
	}
	public int getClearancLevel() {
		return 1;
	}
}

class Developer extends User {
	protected int projects;
	public Developer(String name , int projects) {
		super(name);
		this.projects = projects;
	}
	@Override
	public int getClearancLevel() {
		return 2;
	}
}

class Admin extends Developer {
	protected String adminKey;
	public Admin(String name , int projects , String adminKey) {
		super(name , projects);
		this.adminKey = adminKey;
	}
	@Override
	public int getClearancLevel() {
		return 3;
	}
	public String getAdminKey() {
		return adminKey;
	}
}

public class Lab5_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String devName = input.nextLine();
		int devProject = input.nextInt();
		input.nextLine();
		String adminName = input.nextLine();
		int adminProject = input.nextInt();
		input.nextLine();
		String adminKey = input.nextLine();
		
		User u1 = new User("Guest");
		User d1 = new Developer(devName , devProject);
		User a1 = new Admin(adminName , adminProject , adminKey);
		User[] u = {u1 , d1 , a1};
		
		int totalClearance = 0;
		for(int i = 0; i < u.length; i++) {
			totalClearance = totalClearance + u[i].getClearancLevel();
		}
		for(int i = 0; i < u.length; i++) {
			if(u[i] instanceof Admin) {
				Admin a = (Admin) u[i];
				System.out.println(a.getAdminKey());
			}
		}
		System.out.println(totalClearance);
		input.close();
	}
}
