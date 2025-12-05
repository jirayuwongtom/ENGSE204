package Lab3_09;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int minLength1;
		String user1_name;
		String user1_pass;
		String user2_name;
		String user2_pass;
		int minLength2;
		String user2_newPass;
		
		minLength1 = input.nextInt();
		input.nextLine();
		user1_name = input.nextLine();
		user1_pass = input.nextLine();
		user2_name = input.nextLine();
		user2_pass = input.nextLine();
		minLength2 = input.nextInt();
		input.nextLine();
		user2_newPass = input.nextLine();
		
		User.setMinLength(minLength1);
		
		User user1 = new User(user1_name , user1_pass);
		User user2 = new User(user2_name , user2_pass);
		
		User.setMinLength(minLength2);
		user2.setPassword(user2_newPass);
		
		System.out.println(user1.getPassword());
		System.out.println(user2.getPassword());
		input.close();

	}

}
