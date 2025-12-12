package Lab4_15;
import java.util.Scanner;

public class AuditRecord {
	private final String user;
	private final String[] logMessages;
	private static int maxMessages = 3;
	
	public AuditRecord(String user) {
		this(user , new String[0]);
	}
	
	public AuditRecord(String user , String[] logs) {
		this.user = user;
		if(logs.length > maxMessages) {
			this.logMessages = new String[maxMessages];
			int start = logs.length - maxMessages;
			for(int i = 0; i < maxMessages; i++) {
				this.logMessages[i] = logs[start + i];
			}
		}else {
			this.logMessages = new String[logs.length];
			for(int i = 0; i < logs.length; i++) {
				this.logMessages[i] = logs[i];
			}
		}
	}
	
	public static void setMaxMessages(int max) {
		if(max > 0) {
			maxMessages = max;
			System.out.println("Policy set to " + max);
		}else {
			System.out.println("Invalid policy");
		}
	}

	public AuditRecord addMessage(String message) {
		if(logMessages.length >= maxMessages) {
			System.out.println("Log is full");
			return this;
		}
		String[] newLog = new String[logMessages.length + 1];
		for(int i = 0; i < logMessages.length; i++) {
			newLog[i] = logMessages[i];
		}
		newLog[logMessages.length] = message;
		System.out.println(message + " added");
		return new AuditRecord(this.user , newLog);
	}
	
	public void displayLog() {
		System.out.print("User : " + user + " , Logs : " + logMessages.length + " [");
		for (int i = 0; i < logMessages.length; i++) {
            System.out.print(logMessages[i]);
            if (i < logMessages.length - 1) System.out.print(" , ");
        }
        System.out.println("]");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = input.nextInt();
		input.nextLine();
		AuditRecord.setMaxMessages(max);
		String user = input.nextLine();
		AuditRecord r = new AuditRecord(user);
		int n = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < n; i++) {
			String m = input.nextLine();
			if(m.equals("SET_POLICY")) {
				int newMax = input.nextInt();
				input.nextLine();
				AuditRecord.setMaxMessages(newMax);
			}else {
				r = r.addMessage(m);
			}
		}
		r.displayLog();
		input.close();
	}
}
