package Lab4_11;
import java.util.Scanner;
public class Configuration {
	private final String theme;
	private final int fontSize;
	private final boolean darkMode;
	
	public Configuration(String theme , int fontSize , boolean darkMode) {
		if(fontSize < 10) {
			this.fontSize = 10;
		}else if(fontSize > 20) {
			this.fontSize = 20;
		}else {
			this.fontSize = fontSize;
		}
		this.theme = theme;
		this.darkMode = darkMode;
	}
	
	public Configuration(Configuration base , Configuration user) {
		this.theme = user.theme;
		this.darkMode = user.darkMode;
		this.fontSize = base.fontSize;
	}
	
	public void displaySettings() {
		System.out.println("Theme : " + theme + " , Size : " + fontSize + " , Dark : " + darkMode);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String baseTheme = input.nextLine();
		int baseFontSize = input.nextInt();
		boolean baseDarkMode = input.nextBoolean();
		input.nextLine();
		String userTheme = input.nextLine();
		int userFontSize = input.nextInt();
		boolean userDarkMode = input.nextBoolean();
		
		Configuration baseConfig = new Configuration(baseTheme , baseFontSize , baseDarkMode);
		Configuration userConfig = new Configuration(userTheme , userFontSize , userDarkMode);
		Configuration finalConfig = new Configuration(baseConfig , userConfig);
		
		finalConfig.displaySettings();
		input.close();

	}

}
