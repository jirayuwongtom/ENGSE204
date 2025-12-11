package Lab3_11;
import java.util.Scanner;
public class SystemConfig {
	private static SystemConfig instance;
	private String serverUrl;
	private int maxConnections;
	
	private SystemConfig() {
		this.serverUrl = "default.server.com";
		this.maxConnections = 10;
	}
	
	public static SystemConfig getInstance() {
		if(instance == null) {
			instance = new SystemConfig();
		}
		return instance;
	}
	
	public String getServerUrl() {
		return serverUrl;
	}
	
	public void setServerUrl(String url) {
		this.serverUrl = url;
	}
	
	public int getMaxConnections() {
		return maxConnections;
	}
	
	public void setMaxConnections(int count) {
		if(count > 0) {
			this.maxConnections = count;
			System.out.println("Max connections set");
		}else {
			System.out.println("Invalid count");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < n; i++) {
			String command = input.nextLine();
			
			if(command.equals("SET_URL")) {
				String newURL = input.nextLine();
				SystemConfig config = SystemConfig.getInstance();
				config.setServerUrl(newURL);
			}
			else if(command.equals("SET_MAX")) {
				int newMaxCount = input.nextInt();
				input.nextLine();
				SystemConfig config = SystemConfig.getInstance();
				config.setMaxConnections(newMaxCount);
			}
			else if(command.equals("SHOW")) {
				SystemConfig config = SystemConfig.getInstance();
				System.out.println("URL : " + config.getServerUrl());
				System.out.println("MAX : " + config.getMaxConnections());
			}
		}
		input.close();
	}

}
