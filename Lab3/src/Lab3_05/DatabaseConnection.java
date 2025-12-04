package Lab3_05;
import java.util.Scanner;

public class DatabaseConnection {
	private String connectionString;
	private boolean connected;
	
	public DatabaseConnection(String connectionString) {
		this.connectionString = connectionString;
		this.connected = false;
	}
	
	public boolean isConnected() {
		return connected;
	}
	
	public void connect() {
		if(!connected) {
			connected = true;
			System.out.println("Connected to " + connectionString);
		}else {
			System.out.println("Already connected");
		}
	}
	
	public void disconnect() {
		if(connected) {
			connected = false;
			System.out.println("Disconnected");
		}else {
			System.out.println("Already connected");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String con;
		con = input.nextLine();
		
		DatabaseConnection dc = new DatabaseConnection(con);
		dc.connect();
		dc.disconnect();
		dc.disconnect();
		
		System.out.println(dc.isConnected());
		
		input.close();

	}

}
