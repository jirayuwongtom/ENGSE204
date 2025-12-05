package Lab3_10;
import java.util.Scanner;

public class SystemLogger {
	private static int currentLogLevel = 1;
	
	private static String getLevelName(int level) {
		if(level == 1) {
			return "INFO";
		}
		else if (level == 2) {
			return "DEBUG";
		}
		else if (level == 3) {
			return "ERROR";
		}
		else {
			return "UNKNOWN";
		}		
	}
	
	public static void setLogLevel(int newLevel) {
		if(newLevel >= 1 && newLevel <= 3) {
			currentLogLevel = newLevel;
			System.out.println("Log level set to " + getLevelName(newLevel));
		}else {
			System.out.println("Invalid log level");
		}
	}

	public static void log(int messageLevel , String message) {
		if(messageLevel >= currentLogLevel) {
			System.out.println("[" + getLevelName(messageLevel) + "] : " + message);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		n = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < n; i++) {
			String command = input.nextLine().trim();
			
			if(command.equals("SET")) {
				int newLevel = input.nextInt();
				input.nextLine();
				SystemLogger.setLogLevel(newLevel);
			}else if (command.equals("LOG")) {
				int level = input.nextInt();
				input.nextLine();
				String message = input.nextLine();
				SystemLogger.log(level, message);
			}
		}
		input.close();
	}
}
